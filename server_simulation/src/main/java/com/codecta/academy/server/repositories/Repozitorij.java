package com.codecta.academy.server.repositories;

import com.codecta.academy.server.models.KreditnaKartica;
import com.codecta.academy.server.models.ModelObject;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class Repozitorij<T extends ModelObject> {

    HashMap<Integer, T> bazaPodataka = new HashMap<>();

    /**
     * Metoda za dodavanje objekta u bazu podataak
     * @param objekt kojeg treba dodati u bazu
     * @return objekt dodan u bazu sa generisanim Id-em
     */
    public T dodaj(T objekt){
        objekt.setId(bazaPodataka.size() + 1);

        try{
            bazaPodataka.put(objekt.getId(), objekt);
            return objekt;
        }catch (Exception e){
            System.out.println("Greška pri dodavanju objekta u bazu! " + e.getMessage());
            return null;
        }
    }

    /**
     * Metoda koja dohvata sve kartice iz baze podataka
     * @return lista kreditnih kartica
     */
    public List<T> dohvatiSveKartice(){
        return bazaPodataka.values().stream().collect(Collectors.toList());
    }
}
