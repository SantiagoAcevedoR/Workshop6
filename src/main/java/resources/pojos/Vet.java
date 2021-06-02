package resources.pojos;

import javax.persistence.*;

/**
 * Creating Pojo vet with constructor and Getters and Setters
 */

public class Vet {


    private String username;


    private String name;

    private String address;

    private String neighborhood;

    /**
     * Creating default constructor
     */
    public Vet() {
    }

    /**
     * Creating an specific constructor
     * @param username is the name that was created by the program . username!= null, username!= " "
     * @param name is the name for the vet. name != null, name !=" "
     * @param address is the location for the house. address!= null, address
     * @param neighborhood where the vet is located. neighborhood != null ,neighborhood != " "
     */

    public Vet(String username, String name, String address, String neighborhood) {
        this.username = username;
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
}
