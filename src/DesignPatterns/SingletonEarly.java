package DesignPatterns;

public class SingletonEarly {

	//In early/Eager initilization singleton class. we initialize the singleton instance at first itself.
	private final static SingletonEarly singleton_instance = new SingletonEarly();
	
	private SingletonEarly() {
	}
	
	public static SingletonEarly singleton() {
		return singleton_instance;
	}
	
}
