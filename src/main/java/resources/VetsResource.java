package resources;

import resources.pojos.Owner;
import resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
/**
 * Creating the resource of vet with @Path, @Get notation
 */
@Path("/vets")

public class VetsResource {

    /**
     * This operation of Restful list vets
     * @return list vets
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        List<Vet> vets = new ArrayList<Vet>();
        vets.add(new Vet("rogelio1", "Rogelio", "cra 60", "bosa"));
        vets.add(new Vet("bailarina77", "luna gil", "cll 2", "subayork"));

        return Response.ok()
                .entity(vets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Vet vet) {

        return Response.status(Response.Status.CREATED)
                .entity(vet)
                .build();
    }

}
