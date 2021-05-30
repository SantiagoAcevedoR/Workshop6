package resources;

import resources.pojos.Case;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pets/{pet_id}/cases/{id}")
public class CaseResource {


    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("pet_id") Integer authorId, @PathParam("id") Integer caseId, Case caso) {

        return Response.ok()
                .entity(caso)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("pet_id") Integer authorId, @PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }
}
