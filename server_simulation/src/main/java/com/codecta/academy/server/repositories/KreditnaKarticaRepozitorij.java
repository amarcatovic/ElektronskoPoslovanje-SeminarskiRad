package com.codecta.academy.server.repositories;

import com.codecta.academy.server.models.KreditnaKartica;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KreditnaKarticaRepozitorij extends Repozitorij<KreditnaKartica> {

    public KreditnaKartica dohvatiKreditnuKarticuSOdgovarajucimBrojem(String brojKartice){
        KreditnaKartica rezultat = null;
        for(int i = 1; i <= bazaPodataka.size(); ++i){
            rezultat = bazaPodataka.get(i);
            if(rezultat.getBroj().equals(brojKartice))
                break;
        }

        return rezultat;
    }
}
