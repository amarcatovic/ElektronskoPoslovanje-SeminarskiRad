package com.codecta.academy.server;

import com.codecta.academy.server.models.KreditnaKartica;
import com.codecta.academy.server.models.PlacanjeHelper;
import com.codecta.academy.server.models.PlacanjeOdgovor;
import com.codecta.academy.server.models.Zahtjev;
import com.codecta.academy.server.services.ProdavnicaServis;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.security.InvalidParameterException;

@Path("servis")
public class PlacanjeResurs {
    @Inject
    ProdavnicaServis prodavnicaServis;

    @POST
    @Path("/placanje")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    public Response zahtjevZaPlacanje(Zahtjev zahtjev, @Context UriInfo uriInfo) {
        PlacanjeHelper placanjeHelper = generisiObjekatZaPlacanje(zahtjev);
        try{
            if(prodavnicaServis.zahtjevZaPlacanje(placanjeHelper)){
                PlacanjeOdgovor placanjeOdgovor = generisiOdgovor(true, placanjeHelper.getKolicina());
                return Response.ok(placanjeOdgovor).build();
            }
        } catch(InvalidParameterException error){
            return Response.status(Response.Status.FORBIDDEN).build();
        }

        return Response.status(Response.Status.BAD_REQUEST).build();
    }

    private PlacanjeOdgovor generisiOdgovor(boolean status, Double novac){
        PlacanjeOdgovor rezultat = new PlacanjeOdgovor();
        rezultat.setJeLiUspjelo(status);
        rezultat.setNovac(novac);

        return rezultat;
    }

    private PlacanjeHelper generisiObjekatZaPlacanje(Zahtjev zahtjev){
        KreditnaKartica kreditnaKartica = new KreditnaKartica();
        kreditnaKartica.setBroj(zahtjev.getBroj());
        kreditnaKartica.setImeKorisnika(zahtjev.getImeKorisnika());
        kreditnaKartica.setStanje(1500.0);
        PlacanjeHelper rezultat = new PlacanjeHelper();
        rezultat.setKreditnaKartica(kreditnaKartica);
        rezultat.setKolicina(zahtjev.getKolicina());
        rezultat.setProdavnicaId(zahtjev.getProdavnicaId());

        return rezultat;
    }
}