package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int id;
	private String name;
	private boolean rented;


	public CatImpl(int id, String name) {
		// TODO: Fill in
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	public void rentCat() {
		// TODO: Fill in
		this.rented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		this.rented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// TODO: Fill in
		return this.name;
	}

	public int getId() {
		// TODO: Fill in
		return this.id;
	}

	public boolean getRented() {
		// TODO: Fill in
		return this.rented;
	}

	public String toString() {
		// TODO: Fill in
		String ret = "ID ";
		ret += this.id;
		ret += ". ";
		ret += this.name;
		return ret;
	}

}