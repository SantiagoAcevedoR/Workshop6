package resources;

import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Creating the resource of vet with @Path, @Put and @Delete notation
 */
@Path("/owners/{owner_id}/pets/{id}")
public class PetResource {

    /**
     * This operation of Restful modify any pet
     * @param ownerId is the id that identify the owner. ownerId!=null, ownerId!=" "
     * @param id is the id that identify the pet. id!=null, id!=" "
     * @param pet is the object. pet!=null
     * @return the pet modified
     */

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("owner_id") Integer ownerId,@PathParam("id") int id, Pet pet) {

        return Response.ok()
                .entity(pet)
                .build();
    }

    /**
     * This operation of Restful delete any pet
     * @param ownerId is the id that identify the owner. ownerId!=null, ownerId!=" "
     * @param id is the id that identify the pet. id!=null, id!=" "
     * @return 204 no content
     */
    @DELETE
    public Response delete(@PathParam("owner_id") Integer ownerId,@PathParam("id") int id) {

        return Response.noContent()
                .build();
    }
}
