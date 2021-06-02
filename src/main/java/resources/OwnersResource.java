package resources;

import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of owner with @Path, @Post notation
 */
@Path("/owners")
public class OwnersResource {

    /**
     * This operation of Restful create an owner
     * <b> pre </b> The Owner need to be created and initialized ( is not null) <br>
     * <b> post </b> The owner was created  <br>
     * @param owner is the owner.owner!=null, owner!=" "
     * @return the owner created
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Owner owner) {

        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }

}
