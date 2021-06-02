package resources;

import resources.pojos.Visit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/visits/{param}")
public class VisitsTotalResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("param") String param) {

        List<Visit> visits = new ArrayList<Visit>();
        List<Visit> visitsParam = new ArrayList<Visit>();
        visits.add(new Visit(1, "11/12/2021", "Perdida", "Mira la reina del flow", 1, 1));
        visits.add(new Visit(2, "13/11/2021", "Robo", "Robado en soacha", 1, 1));


        for (int i = 0; i < visits.size(); i++) {
            if (param.equals(visits.get(i).getType()) || param.equals(""+visits.get(i).getVet_id())) {
                visitsParam.add(visits.get(i));
            }
        }

        return Response.ok()
                .entity(visitsParam)
                .build();
    }
}
