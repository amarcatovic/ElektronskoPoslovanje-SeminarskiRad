package com.codecta.academy.server.models;

public class KreditnaKartica extends ModelObject{
    private String broj;
    private String imeKorisnika;
    private Double stanje;

    public String getBroj() {
        return broj;
    }

    public KreditnaKartica(String broj, String imeKorisnika, Double stanje) {
        this.broj = broj;
        this.imeKorisnika = imeKorisnika;
        this.stanje = stanje;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getImeKorisnika() {
        return imeKorisnika;
    }

    public void setImeKorisnika(String imeKorisnika) {
        this.imeKorisnika = imeKorisnika;
    }

    public Double getStanje() {
        return stanje;
    }

    public void setStanje(Double stanje) {
        this.stanje = stanje;
    }
}
