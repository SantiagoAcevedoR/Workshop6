package resources;

import resources.pojos.Owner;
import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Creating the resource of pet with @Path, @Put and @Delete notation
 */
@Path("/vets/{username}")
public class VetResource {

    /**
     * This operation of Restful modify any vet
     * @param username is the name of the owner. username!=null, username!=" "
     * @param vet is the object. vet!=null, vet!=" "
     * @return
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Vet vet) {

        return Response.ok()
                .entity(vet)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("username") String username) {

        return Response.noContent()
                .build();
    }

}
