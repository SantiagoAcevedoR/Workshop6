package resources.pojos;

/**
 * Creating Pojo Visit with constructor and Getters and Setters
 */
public class Visit {

    private int visit_id;
    private String created_at;
    private String type;
    private String description;
    private int vet_id;
    private int pet_id;

    /**
     * Creating default constructor
     */
    public Visit() {
    }

    /**
     * Creating an specific constructor
     *
     * @param visit_id    the id that was created by the program. visit_id!=null , visit_id!=" "
     * @param created_at  the date that was created the visit. created_at !=null, created_at visit_id!=" "
     * @param type        is the type of the visit. type!=null , type visit_id!=" "
     * @param description the qualities that has the visit . description!=null, description visit_id!=" "
     * @param vet_id      the id that has the vet. vet_id !=null, vet_id visit_id!=" "
     * @param pet_id      the id that has the pet. pet_id!=null, pet_id visit_id!=" "
     */
    public Visit(int visit_id, String created_at, String type, String description, int vet_id, int pet_id) {
        this.visit_id = visit_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.vet_id = vet_id;
        this.pet_id = pet_id;
    }

    public int getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(int visit_id) {
        this.visit_id = visit_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVet_id() {
        return vet_id;
    }

    public void setVet_id(int vet_id) {
        this.vet_id = vet_id;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }
}
