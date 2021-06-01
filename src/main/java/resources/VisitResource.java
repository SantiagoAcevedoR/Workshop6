package resources;

import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vets&pets/{vet_id}&{pet_id}/visits/{id}")
public class VisitResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("vet_id") Integer vet_id, @PathParam("pet_id") Integer pet_id, @PathParam("id") Integer id, Visit visit) {

        return Response.ok()
                .entity(visit)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("vet_id") Integer vet_id, @PathParam("pet_id") Integer pet_id, @PathParam("id") int id) {

        return Response.noContent()
                .build();
    }

}
