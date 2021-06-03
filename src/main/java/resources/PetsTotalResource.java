package resources;

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
 *  Creating the resource of owner with @Path, @Get notation
 */
@Path("/pets/{param}")
public class PetsTotalResource {
    /**
     * This operation of Restful list the total of pets
     * @param param are the parameters for the search, it can be anything. param!=null
     * @return the total in a list of pets
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("param") String param) {
        List<Pet> pets = new ArrayList<Pet>();
        List<Pet> petsParam = new ArrayList<Pet>();
        pets.add(new Pet(1, "Ab1", "pepe", "Perro", "Golden", "Grande", "Macho", "pp.jpg", 1,"yes"));
        pets.add(new Pet(2, "Ab2", "pepe2", "Gato", "puddle", "Grande", "Macho", "pp2.jpg", 1,"no"));

        for (int i = 0; i < pets.size(); i++) {
            if (param.equals(pets.get(i).getSpecies()) || param.equals(pets.get(i).getRace()) || param.equals(pets.get(i).getSize()) || param.equals(pets.get(i).getSex())) {
                petsParam.add(pets.get(i));
            }
        }

        return Response.ok()
                .entity(petsParam)
                .build();
    }
}
