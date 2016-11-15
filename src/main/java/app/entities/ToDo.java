package app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

	private static int counter = 0;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	public ToDo() {
		super();
		this.name = new Integer(ToDo.counter).toString();
		ToDo.counter++;
	}

	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
	}

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
