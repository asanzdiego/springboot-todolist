package app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public String getName() {

        return this.name;
    }

    public void setName(final String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        final StringBuilder builder = new StringBuilder();
        builder.append("ToDo [id=");
        builder.append(this.id);
        builder.append(", name=");
        builder.append(this.name);
        builder.append("]");
        return builder.toString();
    }

}
