package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{owner_id}/pets")
public class PetsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("owner_id") Integer ownerId) {
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet(1, "Ab1", "pepe","Perro", "Golden","Grande", "Macho", "pp.jpg",ownerId));
        pets.add(new Pet(2, "Ab2", "pepe2","Perro2", "Golden2","Grande", "Macho", "pp2.jpg",ownerId));

        return Response.ok()
                .entity(pets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("owner_id") Integer ownerId, Pet pet) {

        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }
}
