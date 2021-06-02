package resources.pojos;

import javax.persistence.*;

/**
 * Creating Pojo Official with constructors and Getters and Setters
 */

public class Official {


    private String username;

    private String name;

    /**
     * Creating an specific constructor
     * @param username is the name of the user that was enter in the program. username != null, username !=" "
     * @param name is the name of the user. name!=null, name!=" "
     */

    public Official(String username, String name) {
        this.username = username;
        this.name = name;
    }

    /**
     * Creating default constructor
     */
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
