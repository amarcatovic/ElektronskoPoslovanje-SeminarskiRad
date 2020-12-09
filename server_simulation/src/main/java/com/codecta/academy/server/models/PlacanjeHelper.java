package com.codecta.academy.server.models;

public class PlacanjeHelper {
    private KreditnaKartica kreditnaKartica;
    private Double kolicina;
    private Integer prodavnicaId;

    public PlacanjeHelper() {
    }

    public PlacanjeHelper(KreditnaKartica kreditnaKartica, Double kolicina, Integer prodavnicaId) {
        this.kreditnaKartica = kreditnaKartica;
        this.kolicina = kolicina;
        this.prodavnicaId = prodavnicaId;
    }

    public KreditnaKartica getKreditnaKartica() {
        return kreditnaKartica;
    }

    public void setKreditnaKartica(KreditnaKartica kreditnaKartica) {
        this.kreditnaKartica = kreditnaKartica;
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
