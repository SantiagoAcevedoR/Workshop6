package resources.pojos;


import java.util.ArrayList;
import java.util.List;

/**
 * Creating the Pojo Owner with constructor and Getters and Setters
 */
public class Owner {


    private String username;

    private Integer personId;

    private String name;

    private String address;

    private String neighborhood;

    private List<Pet> pets;

    /**
     * Creating default constructor
     */
    public Owner() {
    }

    /**
     * Creating an specific constructor
     * @param username is the name that was created in the program. username != null, username !=" ".
     * @param personId is the id of the person. personId != null, personId!=" ".
     * @param name is the name of the owner. name != null, name !=" "
     * @param address is the location for the house. address!= null, address
     * @param neighborhood is the location where the owner live. neighborhood != null ,neighborhood != " "
     * @param pets is the list of pets that has the owner.
     */

    public Owner(String username, Integer personId, String name, String address, String neighborhood, List<Pet> pets) {
        this.username = username;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.pets = pets;
    }

    /**
     * Creating an specific constructor
     * @param username is the name that was created in the program. username != null, username !=" ".
     * @param personId is the id of the person. personId != null, personId!=" ".
     * @param name is the name of the owner. name != null, name !=" "
     * @param address is the location for the house. address!= null, address
     * @param neighborhood is the location where the owner live. neighborhood != null ,neighborhood != " "
     */

    public Owner(String username, Integer personId, String name, String address, String neighborhood) {
        this.username = username;
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
