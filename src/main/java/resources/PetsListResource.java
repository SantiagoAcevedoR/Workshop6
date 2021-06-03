package resources;


import resources.pojos.Owner;
import resources.pojos.Pet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pets/list/{param}")
public class PetsListResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(@PathParam("param") String param) {

        List<Pet> pets = new ArrayList<>();
        List<Pet> petsParam = new ArrayList<>();
        List<Pet> pets1 = new ArrayList<>();
        Pet pet1 = new Pet(1, "Ab1", "pepe", "Perro", "Golden", "Grande", "Macho", "pp.jpg", 1);
        Pet pet2 = new Pet(2, "Ab2", "Elpepe", "Perro", "Persa", "Chiquito", "Hembra", "Lpp.jpg", 2);

        pets.add(pet1);
        pets.add(pet2);

        pets1.add(pet1);
        Owner owner1 = new Owner("BJR761",1,"Pepe","Avenida Siempre viva","Springfield",pets1);


        for (int i = 0; i < pets.size(); i++) {
            if (param.equals(""+pets.get(i).getPetId()) || param.equals(pets.get(i).getMicrochip()) || param.equals(pets.get(i).getName()) || param.equals(pets.get(i).getSpecies())|| param.equals(pets.get(i).getRace())|| param.equals(pets.get(i).getSize())|| param.equals(pets.get(i).getSex())) {
                petsParam.add(pets.get(i));

            }
        }

        return Response.ok()
                .entity(petsParam)
                .build();
    }

}
