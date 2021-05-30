package resources;

import resources.pojos.Book;
import resources.pojos.Case;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pets/{pet_id}/cases")
public class CasesResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("pet_id") Integer petId) {

        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case(1, "11/12/2021", "Perdida","Mira la reina del flow", petId));
        cases.add(new Case(2, "12/11/2012", "Robo","Mirax2", petId));

        return Response.ok()
                .entity(cases)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("pet_id") Integer petId, Case caso) {


        return Response.status(Response.Status.CREATED)
                .entity(caso)
                .build();
    }
}
