package com.codecta.academy.server.services.impl;


import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.services.BankaStecateljaServis;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BankaStecateljaServisImpl implements BankaStecateljaServis {
    @Override
    public boolean proslijediZahtjevZaPlacanje(PlacanjeHelper placanjeHelper) {
        return false;
    }
}
