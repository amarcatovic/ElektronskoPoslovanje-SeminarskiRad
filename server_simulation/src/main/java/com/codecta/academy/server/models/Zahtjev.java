package com.codecta.academy.server.models;

public class Zahtjev {
    private String broj;
    private String imeKorisnika;
    private Double stanje;
    private Double kolicina;
    private Integer prodavnicaId;

    public String getBroj() {
        return broj;
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

    public Double getKolicina() {
        return kolicina;
    }

    public void setKolicina(Double kolicina) {
        this.kolicina = kolicina;
    }

    public Integer getProdavnicaId() {
        return prodavnicaId;
    }

    public void setProdavnicaId(Integer prodavnicaId) {
        this.prodavnicaId = prodavnicaId;
    }
}
