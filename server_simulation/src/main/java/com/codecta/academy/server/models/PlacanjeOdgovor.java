package com.codecta.academy.server.models;

public class PlacanjeOdgovor {
    private boolean jeLiUspjelo;
    private Double novac;

    public boolean isJeLiUspjelo() {
        return jeLiUspjelo;
    }

    public void setJeLiUspjelo(boolean jeLiUspjelo) {
        this.jeLiUspjelo = jeLiUspjelo;
    }

    public Double getNovac() {
        return novac;
    }

    public void setNovac(Double novac) {
        this.novac = novac;
    }
}
