package bea.pack;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Fruta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class Controller {
    private Set<Fruta> frutas = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public Controller() {
        frutas.add(new Fruta("teste",1));
    }

    @GET
    
    public Set<Fruta> list() {
        return frutas;
    }


    @POST
    public Set<Fruta> add(Fruta fruit) {
        frutas.add(fruit);
        return frutas;
    }

    @DELETE
    public Set<Fruta> delete(Fruta fruta) {
        frutas.removeIf(existingFruta -> existingFruta.getNome().contentEquals(fruta.getNome()));
        return frutas;
    }
}
