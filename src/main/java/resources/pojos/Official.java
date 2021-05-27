package resources.pojos;

import javax.persistence.*;


public class Official {


    private String username;

    private String name;


    public Official(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public Official() {

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
}
