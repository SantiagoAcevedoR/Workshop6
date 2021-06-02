package resources;

import resources.pojos.Owner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{param}")
public class OwnersTotalResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("param") String param) {
        List<Owner> owners = new ArrayList<Owner>();
        List<Owner> ownersParam = new ArrayList<Owner>();
        owners.add(new Owner("FelipeLg", 1, "Felipe Ladino", "cra 60", "bosa"));
        owners.add(new Owner("Porrasi2", 2, "Santiago Porras", "cll 2", "bosa"));


        for (int i = 0; i < owners.size(); i++) {
            if (param.equals(owners.get(i).getNeighborhood())) {
                ownersParam.add(owners.get(i));
            }
        }

        return Response.ok()
                .entity(ownersParam)
                .build();
    }
}
