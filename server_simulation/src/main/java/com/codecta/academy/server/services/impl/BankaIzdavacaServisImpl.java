package com.codecta.academy.server.services.impl;

import com.codecta.academy.server.models.KreditnaKartica;
import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.repositories.KreditnaKarticaRepozitorij;
import com.codecta.academy.server.services.BankaIzdavacaServis;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class BankaIzdavacaServisImpl implements BankaIzdavacaServis {
    @Inject
    KreditnaKarticaRepozitorij kreditnaKarticaRepozitorij;

    @Override
    public boolean izvrsiPlacanjeKlijenta(PlacanjeHelper placanjeHelper) {
        if(autorizujTransakciju(placanjeHelper.getKreditnaKartica(), placanjeHelper.getKolicina())){
            izvrsiPlacanje();
            return true;
        }

        return false;
    }

    /**
     * Metoda koja provjerava da li potrošač ima dovoljno novca na računu
     * @param kreditnaKartica objekat kreditne kartice potrošača
     * @param cijena cijena transakcije
     * @return true ukoliko se transakcija može izvršiti, false ako ne može
     */
    private boolean autorizujTransakciju(KreditnaKartica kreditnaKartica, Double cijena){
        verifikujValidnostKartice(kreditnaKartica);

        KreditnaKartica kreditnaKarticaIzBanke =
                kreditnaKarticaRepozitorij.dohvatiKreditnuKarticuSOdgovarajucimBrojem(kreditnaKartica.getBroj());

        if(kreditnaKarticaIzBanke.getStanje() >= cijena){
            return true;
        }

        return false;
    }

    private void izvrsiPlacanje(){

    }

    private void verifikujValidnostKartice(KreditnaKartica kreditnaKartica){
        kreditnaKarticaRepozitorij.dodaj(kreditnaKartica);
    }
}
