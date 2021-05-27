package edu.unbosque.WebServicesTutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Official")
public class Official {

    //REVISAR ENTITY FK,PK
    @Id
    @JoinColumn(name = "username")
    private String username;

    @Column(name = "name", nullable = false)
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
