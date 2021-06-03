package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of owner with @Path, @Get notation
 */
@Path("/owners/list/{param}")
public class OwnersListResource {
    /**
     * This operation of Restful get a list of any owner
     * <b> pre </b> The Owner need to be created and initialized ( is not null) <br>
     * <b> post </b> The total of owner was obtained   <br>
     * @param param the parameters that has the owner. param!=null , param!=" "
     * @return the list of owner.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("param") String param) {
        List<Owner> owners = new ArrayList<>();
        List<Owner> ownersParam = new ArrayList<>();
        List<Pet> pets1 = new ArrayList<>();
        pets1.add(new Pet(1, "Ab1", "pepe", "Perro", "Golden", "Grande", "Macho", "pp.jpg", 1,"yes"));
        pets1.add(new Pet(2, "Ab2", "Pablito", "Gato", "Criollo", "Pequenio", "Macho", "Pablito.jpg", 1,"yes"));

        List<Pet> pets2 = new ArrayList<Pet>();
        pets2.add(new Pet(3, "Bb1", "Gardfield", "Gato", "Mixto", "Grande", "Macho", "geirfield.jpg", 2,"no"));
        owners.add(new Owner("FelipeLg", 1, "Felipe Ladino", "cra 60", "bosa", pets1));
        owners.add(new Owner("Porrasi2", 2, "Santiago Porras", "cll 2", "cotayork", pets2));


        for (int i = 0; i < owners.size(); i++) {
            if (param.equals(owners.get(i).getUsername()) || param.equals("" + owners.get(i).getPersonId()) || param.equals(owners.get(i).getName()) || param.equals(owners.get(i).getAddress()) || param.equals(owners.get(i).getNeighborhood())) {
                ownersParam.add(owners.get(i));
            }
        }

        return Response.ok()
                .entity(ownersParam)
                .build();
    }
}
