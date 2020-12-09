package com.codecta.academy.server.services.impl;

import com.codecta.academy.server.models.KreditnaKartica;
import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.services.BankaIzdavacaServis;
import com.codecta.academy.server.services.VisaServis;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class VisaServisImpl implements VisaServis {
    @Inject
    BankaIzdavacaServis bankaIzdavacaServis;

    @Override
    public boolean obradiZahtjev(PlacanjeHelper placanjeHelper) {
        if(bankaIzdavacaServis.izvrsiPlacanjeKlijenta(placanjeHelper)){
            naplatiTroskoveServisa();
            return true;
        }

        return false;
    }

    private void naplatiTroskoveServisa(){

    }
}
