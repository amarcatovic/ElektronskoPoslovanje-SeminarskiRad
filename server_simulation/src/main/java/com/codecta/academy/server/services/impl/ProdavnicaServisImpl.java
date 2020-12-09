package com.codecta.academy.server.services.impl;

import com.codecta.academy.server.models.KreditnaKartica;
import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.services.ProdavnicaServis;

import javax.enterprise.context.ApplicationScoped;
import java.security.InvalidParameterException;

@ApplicationScoped
public class ProdavnicaServisImpl implements ProdavnicaServis {
    @Override
    public boolean zahtjevZaPlacanje(PlacanjeHelper placanjeHelper) throws InvalidParameterException {
        if(this.luhnovAlgoritam(placanjeHelper.getKreditnaKartica())){
            throw new InvalidParameterException("Broj kreditne kartice nije validan");
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
}
