package resources.pojos;

/**
 * Creating the Pojo Pet with constructors and Getters and Setters
 */
public class Pet {
    private int petId;
    private String microchip;
    private String name;
    private String species;
    private String race;
    private String size;
    private String sex;
    private String picture;
    private int owner_id;
    private String sterilized;

    /**
     * Creating default constructor
     */
    public Pet() {
    }



    /**
     * Creating an specific constructor
     *
     * @param petId     is the id for the pet that we choose . petId !=null, petId !=" "
     * @param microchip is the identification that we put in the pet.
     * @param name      is the reference for the pet
     * @param species   is the specie of the pet. species !=null, species !=" "
     * @param race      is the race of the pet. race !=null , race != " "
     * @param size      is the size of the pet. size!=null, size!=" "
     * @param sex       is the sex od the pet . sex!=null, sex!= " "
     * @param picture   is the image for the pet.
     * @param owner_id  is the id for the owner.
     */
    public Pet(int petId, String microchip, String name, String species, String race, String size, String sex, String picture, int owner_id, String sterilized) {
        this.petId = petId;
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
        this.owner_id = owner_id;
        this.sterilized = sterilized;
    }


    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getSterilized() {
        return sterilized;
    }

    public void setSterilized(String sterilized) {
        this.sterilized = sterilized;
    }
}
