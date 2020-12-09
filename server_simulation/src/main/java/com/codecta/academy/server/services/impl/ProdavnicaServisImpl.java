package com.codecta.academy.server.services.impl;

import com.codecta.academy.server.models.KreditnaKartica;
import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.models.ProcesPlacanjaHelper;
import com.codecta.academy.server.services.BankaStecateljaServis;
import com.codecta.academy.server.services.ProdavnicaServis;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.security.InvalidParameterException;

@ApplicationScoped
public class ProdavnicaServisImpl implements ProdavnicaServis {
    @Inject
    BankaStecateljaServis bankaStecateljaServis;

    @Override
    public boolean zahtjevZaPlacanje(PlacanjeHelper placanjeHelper) throws InvalidParameterException {
        if(!this.luhnovAlgoritam(placanjeHelper.getKreditnaKartica())){
            throw new InvalidParameterException("Broj kreditne kartice nije validan");
        }

        ProcesPlacanjaHelper procesPlacanjaHelper = new ProcesPlacanjaHelper();
        String brojRacunaProdavnice = this.uzmiBrojRacunaPrekoId(placanjeHelper.getProdavnicaId());
        procesPlacanjaHelper.setBrojRacunaProdavnice(brojRacunaProdavnice);
        procesPlacanjaHelper.setCijena(placanjeHelper.getKolicina());
        procesPlacanjaHelper.setKreditnaKarticaPotrosaca(placanjeHelper.getKreditnaKartica());
        if(bankaStecateljaServis.proslijediZahtjevZaPlacanje(procesPlacanjaHelper)){
            return true;
        }

        return false;
    }

    /**
     * Metoda koja provjerava da li je broj kreditne kartice validan upotrebom Luhnovog algoritma
     * @param kreditnaKartica objekat kreditna kartica
     * @return true ukoliko je broj validan, false u suprotnom
     */
    private boolean luhnovAlgoritam(KreditnaKartica kreditnaKartica){

        int duzina = kreditnaKartica.getBroj().length();

        int suma = 0;
        boolean jeliParan = false;
        for (int i = duzina - 1; i >= 0; i--)
        {
            int cifra = kreditnaKartica.getBroj().charAt(i) - '0';

            if (jeliParan == true)
                cifra = cifra * 2;

            suma += cifra / 10;
            suma += cifra % 10;

            jeliParan = !jeliParan;
        }

        return (suma % 10 == 0);
    }

    /**
     * Metoda koja iz baze podataka stecateljske banke uzima broj računa prodavnice na osnovu id-a prodavnice
     * @param id id prodavnice
     * @return broj racuna prodavnice
     */
    private String uzmiBrojRacunaPrekoId(Integer id){
        return "0123456789";
    }
}
