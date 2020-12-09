package com.codecta.academy.server.models;

public class ProcesPlacanjaHelper {
    private KreditnaKartica kreditnaKarticaPotrosaca;
    private Double cijena;
    private String brojRacunaProdavnice;

    public KreditnaKartica getKreditnaKarticaPotrosaca() {
        return kreditnaKarticaPotrosaca;
    }

    public void setKreditnaKarticaPotrosaca(KreditnaKartica kreditnaKarticaPotrosaca) {
        this.kreditnaKarticaPotrosaca = kreditnaKarticaPotrosaca;
    }

    public Double getCijena() {
        return cijena;
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
    }

    public String getBrojRacunaProdavnice() {
        return brojRacunaProdavnice;
    }

    public void setBrojRacunaProdavnice(String brojRacunaProdavnice) {
        this.brojRacunaProdavnice = brojRacunaProdavnice;
    }
}
