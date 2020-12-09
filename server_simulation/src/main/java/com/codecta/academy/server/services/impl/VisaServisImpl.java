package com.codecta.academy.server.services.impl;

import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.services.VisaServis;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VisaServisImpl implements VisaServis {
    @Override
    public boolean obradiZahtjev(PlacanjeHelper placanjeHelper) {
        return false;
    }
}
