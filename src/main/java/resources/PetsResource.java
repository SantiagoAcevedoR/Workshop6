package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of case with @Path, @Post notation
 */
@Path("/owners/{owner_id}/pets")
public class PetsResource {

    /**
     * This operation of Restful modify any case
     * @param ownerId is the Id that identify the owner, ownerId!=null
     * @param pet is the object. pet!=null, pet!=" "
     * @return the pet.
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("owner_id") Integer ownerId, Pet pet) {

        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }
}
