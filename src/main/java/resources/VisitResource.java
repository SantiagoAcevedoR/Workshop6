package resources;

import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 * Creating the resource of visit with @Path, @Put and @Delete notation
 */
@Path("/vets&pets/{vet_id}&{pet_id}/visits/{id}")

public class VisitResource {

    /**
     * This operation of Restful modify a vet
     * @param vet_id the id of the vet.vet_id!=null, vet_id!=" "
     * @param pet_id the id of the pet. pet_id!=null, pet_id!=" "
     * @param id the number of the visit. id!=null, id!=" "
     * @param visit the object. visit!=null
     * @return the visit modified
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("vet_id") Integer vet_id, @PathParam("pet_id") Integer pet_id, @PathParam("id") Integer id, Visit visit) {

        return Response.ok()
                .entity(visit)
                .build();
    }

    /**
     * This operation of Restful delete a vet
     * @param vet_id the id of the vet.vet_id!=null, vet_id!=" "
     * @param pet_id the id of the pet. pet_id!=null, pet_id!=" "
     * @param id the number of the visit. id!=null, id!=" "
     * @return 204 no Content
     */
    @DELETE
    public Response delete(@PathParam("vet_id") Integer vet_id, @PathParam("pet_id") Integer pet_id, @PathParam("id") int id) {

        return Response.noContent()
                .build();
    }

}
