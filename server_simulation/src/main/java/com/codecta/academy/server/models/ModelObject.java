package com.codecta.academy.server.models;

import java.util.Date;

public class ModelObject {
    private Integer id;
    private Date datumDodavanja;
    private Date datumIzmjene;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatumDodavanja() {
        return datumDodavanja;
    }

    public void setDatumDodavanja(Date datumDodavanja) {
        this.datumDodavanja = datumDodavanja;
    }

    public Date getDatumIzmjene() {
        return datumIzmjene;
    }

    public void setDatumIzmjene(Date datumIzmjene) {
        this.datumIzmjene = datumIzmjene;
    }
}
