package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/owners/{owner_id}/pets/{id}")
public class PetResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("owner_id") Integer ownerId,@PathParam("id") int id, Pet pet) {

        return Response.ok()
                .entity(pet)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("owner_id") Integer ownerId,@PathParam("id") int id) {

        return Response.noContent()
                .build();
    }
}
