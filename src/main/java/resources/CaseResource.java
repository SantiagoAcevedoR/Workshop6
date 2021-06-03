package resources;

import resources.pojos.Case;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Creating the resource of case with @Path, @Put and @Delete notation
 */
@Path("/pets/{pet_id}/cases/{id}")
public class CaseResource {

    /**
     * This operation of Restful modify any case
     * <b> pre </b> The pet need to be created and initialized ( is not null) <br>
     * <b> post </b> The pet was modified  <br>
     * @param authorId the id of the author. authorId!=null, authorId!=" "
     * @param caseId the id of the case that is being created. caseId!=null, caseId!=" "
     * @param caso the case. caso!=null, caso!=" "
     * @return the case modified. authorId!=null, authorId!=" "
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("pet_id") Integer authorId, @PathParam("id") Integer caseId, Case caso) {

        return Response.ok()
                .entity(caso)
                .build();
    }

    /**
     * This operation of Restful delete any case
     * <b> pre </b> The pet need to be created and initialized ( is not null) <br>
     * <b> post </b> The case was deleted <br>
     * @param authorId the id of the author. authorId!=null, authorId!=" "
     * @param id is the id of the case. id!=null, id!=" "
     * @return 204 no Content
     */
    @DELETE
    public Response delete(@PathParam("pet_id") Integer authorId, @PathParam("id") Integer id) {

        return Response.noContent()
                .build();
    }
}
