package resources;

import resources.pojos.Owner;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Creating the resource of owner with @Path, @Put and @Delete notation
 */
@Path("/owners/{id}")
public class OwnerResource {

    /**
     * This operation of Restful modify any owner
     * <b> pre </b> The Owner need to be created and initialized ( is not null) <br>
     * <b> post </b> The Owner was modified  <br>
     * @param id id of the owner. id!=null, id!=" "
     * @param owner the owner. owner!=null, owner!=" "
     * @return the owner modified
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("id") Integer id, Owner owner) {

        return Response.ok()
                .entity(owner)
                .build();
    }

    /**
     * This operation of Restful delete any owner
     * <b> pre </b> The owner need to be created and initialized ( is not null) <br>
     * <b> post </b> The owner was deleted <br>
     * @param id is the id of the owner. id!=null, id!=" "
     * @return the owner was deleted
     */

    @DELETE
    public Response delete(@PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }

}
