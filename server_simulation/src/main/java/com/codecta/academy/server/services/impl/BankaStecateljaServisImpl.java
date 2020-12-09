package com.codecta.academy.server.services.impl;


import com.codecta.academy.server.models.KreditnaKartica;
import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.models.ProcesPlacanjaHelper;
import com.codecta.academy.server.services.BankaStecateljaServis;
import com.codecta.academy.server.services.VisaServis;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BankaStecateljaServisImpl implements BankaStecateljaServis {
    @Inject
    VisaServis visaServis;

    @Override
    public boolean proslijediZahtjevZaPlacanje(ProcesPlacanjaHelper procesPlacanjaHelper) {

        if(provjeriValidnostRacuna(procesPlacanjaHelper.getBrojRacunaProdavnice())) {
            PlacanjeHelper placanjeHelper = new PlacanjeHelper();
            placanjeHelper.setKolicina(procesPlacanjaHelper.getCijena());
            placanjeHelper.setKreditnaKartica(procesPlacanjaHelper.getKreditnaKarticaPotrosaca());
            if (visaServis.obradiZahtjev(placanjeHelper)) {
                izvrsiUplatuNaRacunProdavnice(procesPlacanjaHelper.getBrojRacunaProdavnice(), procesPlacanjaHelper.getCijena());
                return true;
            }
        }

        return false;
    }

    /**
     * Metoda koja provjerava broj racuna prodavnice
     * @param brojRacuna broj racuna prodavnice
     * @return true ukoliko je u bazi, false ukoliko nije
     */
    private boolean provjeriValidnostRacuna(String brojRacuna){
        return true;
    }

    /**
     * Metoda koja na racun prodavnice uplacuje određeni iznos
     * @param iznos
     */
    private void izvrsiUplatuNaRacunProdavnice(String brojRacuna, Double iznos){

    }
}
