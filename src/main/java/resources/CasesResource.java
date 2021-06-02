package resources;

import resources.pojos.Case;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of cases with @Path, @Get and @Post notation
 */
@Path("/pets/{pet_id}/cases")
public class CasesResource {

    /**
     * This operation of Restful obtain any case
     * <b> pre </b> The pet need to be created and initialized ( is not null) <br>
     * <b> post </b> The pet was obtained <br>
     *
     * @param petId the id of the pet that need to be obtain . petId!=null, petId!=" "
     * @return the case.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("pet_id") Integer petId) {

        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case(1, "11/12/2021", "Perdida", "Mira la reina del flow", petId));
        cases.add(new Case(2, "12/11/2012", "Robo", "Mirax2", petId));

        return Response.ok()
                .entity(cases)
                .build();
    }


    /**
     * This operation of Restful creat a case
     * <b> pre </b> The Pojo pet need to be created ( is not null) <br>
     * <b> post </b> The pet was created <br>
     *
     * @param petId the id of the pet that need to be obtain . petId!=null, petId!=" "
     * @param caso  the case. caso!=null, caso!=" "
     * @return the case created.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("pet_id") Integer petId, Case caso) {


        return Response.status(Response.Status.CREATED)
                .entity(caso)
                .build();
    }
}
