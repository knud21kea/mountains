package uds.exercise.mountain.models;

import javax.persistence.*;

@Entity
public class Mountain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Mountain(String name) {
        this.name = name;
    }

    public Mountain() {
    }

    @Column
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
