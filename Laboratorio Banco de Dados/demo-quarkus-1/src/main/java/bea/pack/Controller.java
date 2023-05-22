package bea.pack;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;

@Path("/Fruta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.WILDCARD)

public class Controller {
	private List<Fruta> frutasExistentes = new ArrayList<Fruta>();
	private List<Fruta> frutas = new ArrayList<Fruta>();

    public Controller() {
    	frutasExistentes.add(new Fruta("Fruta1",10));
    	frutasExistentes.add(new Fruta("Fruta2",10));
    }

    
    @GET
    @Path("/loja")
    public Response list() {
		String json = new Gson().toJson(frutasExistentes);
    	return Response.status(200).entity(json).build();
    }
    
    @GET
    @Path("/carrinho")
    public Response carrinho() {
		String json = new Gson().toJson(frutas);
    	return Response.status(200).entity(json).build();
    }


    @POST
    @Path("/carrinho")
    public Response add(@FormParam("nome") String name, @FormParam("qtd") Integer qtd) {
    	var fruit = new Fruta(name, qtd);
    	var existe = frutasExistentes.stream()
    			.filter(x -> x.getNome().equals(fruit.getNome()))
    			.findAny();
    	
    	if(existe.isEmpty())
    		return Response.status(500).build();
    	
        frutas.add(fruit);
        String json = new Gson().toJson(frutas);
    	return Response.status(200).entity(json).build();
    }

    @DELETE

    @Path("/carrinho")
    public Response delete(Fruta fruta) {
        frutas.removeIf(existingFruta -> existingFruta.getNome().contentEquals(fruta.getNome()));
        String json = new Gson().toJson(frutas);
    	return Response.status(200).entity(json).build();
    }
}
