package DesignPatterns;

public final class ImmutableClass {
	final String name;
	final int id;
	
	public ImmutableClass(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}
