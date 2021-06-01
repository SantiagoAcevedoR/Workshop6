package resources;


import resources.pojos.Case;
import resources.pojos.Pet;
import resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/vets&pets/{vet_id}&{pet_id}/visits")
public class VisitsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("vet_id") Integer vet_id, @PathParam("pet_id") Integer pet_id) {

        List<Visit> visits = new ArrayList<Visit>();
        visits.add(new Visit(1, "11/12/2021", "Perdida", "Mira la reina del flow", vet_id, pet_id));
        visits.add(new Visit(2, "13/11/2021", "Robo", "Perdido", vet_id, pet_id));

        return Response.ok()
                .entity(visits)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("vet_id") Integer vet_id, @PathParam("pet_id") Integer pet_id, Visit visit) {

        return Response.status(Response.Status.CREATED)
                .entity(visit)
                .build();
    }
}
