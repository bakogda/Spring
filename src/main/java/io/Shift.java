package io;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Bako Gdaniec
 **/

@Data
@Entity
public class Shift {

	private @Id @GeneratedValue long Id;
	private @Column(nullable = false) String shifts;

	Shift() {
	}

	public Shift(String shifts) {
		this.shifts = shifts; 
	}
}