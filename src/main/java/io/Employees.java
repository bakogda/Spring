package io;

import lombok.Data;

import java.util.Arrays;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Bako Gdaniec
 **/

@Data
@Entity
public class Employees {

	private @Id @GeneratedValue long Id;
	private @Column(nullable = false, unique = true) String employeeID; // Assign unique ID to each employee
	private @Column(nullable = false) String firstName;
	private @Column(nullable = false) String lastName;

	@ManyToMany
	private Collection<Shift> shifts; // Used to map an employee to many shifts

	private Employees() {
	}

	public Employees(String employeeID, String firstName, String lastName) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setShift(Shift... shifts) {
		this.shifts = Arrays.asList(shifts); // store shift/s by using a list to then assign to an employee
	}

	public String getName() {
		return firstName;
	}
	
	public String getSurname()
	{
		return lastName;
	}
}