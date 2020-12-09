package com.codecta.academy.server.services;

import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.models.ProcesPlacanjaHelper;

public interface BankaStecateljaServis {
    boolean proslijediZahtjevZaPlacanje(ProcesPlacanjaHelper procesPlacanjaHelper);
}
