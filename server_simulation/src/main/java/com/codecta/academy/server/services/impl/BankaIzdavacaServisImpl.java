package com.codecta.academy.server.services.impl;

import com.codecta.academy.server.services.BankaIzdavacaServis;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankaIzdavacaServisImpl implements BankaIzdavacaServis {
    @Override
    public boolean izvrsiPlacanjeKlijenta() {
        return false;
    }
}
