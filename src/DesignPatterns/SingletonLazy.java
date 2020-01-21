package DesignPatterns;

public class SingletonLazy {

	//In lazy initialization singleton class. we load the singleton instance when singleton() method is called.
	//But early and lazy initialization might not work application is multithreaded. For this case SingleDoubleLocking is used.
	private static SingletonLazy singleton_instance = null;
	
	public String s;
	
	private SingletonLazy() {
		s = "String part of singleton";
	}
	
	public static SingletonLazy singleton() {
		if(singleton_instance == null) {
			singleton_instance = new SingletonLazy();
		}
		return singleton_instance;
	}
}
