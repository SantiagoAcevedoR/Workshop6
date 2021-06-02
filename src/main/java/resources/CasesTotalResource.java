package resources;

import resources.pojos.Case;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/cases/{param}")
public class CasesTotalResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listByType(@PathParam("param") String param) {

        List<Case> cases = new ArrayList<Case>();
        List<Case> casesParam = new ArrayList<Case>();
        cases.add(new Case(1, "11/12/2021", "Perdida", "Mira la reina del flow", 1));
        cases.add(new Case(2, "12/11/2012", "Perdida", "Mirax2", 1));

        for (int i = 0; i < cases.size(); i++) {
            if (param.equals(cases.get(i).getType())) {
                casesParam.add(cases.get(i));
            }
        }

        return Response.ok()
                .entity(casesParam)
                .build();
    }
}
