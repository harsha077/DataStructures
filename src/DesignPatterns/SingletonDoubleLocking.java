package DesignPatterns;

public class SingletonDoubleLocking {
	
	/*When application is multithreaded and singleton class is being used. In that case, an additional check is added with a synchronized block. 
	The synchronized block allows the first thread and puts remaining threads on hold. After hold is released. As first thread creates an instance
	remaining threads will not be able to create singleton instances*/ 
	private static SingletonDoubleLocking singleton_instance = null;
	
	private SingletonDoubleLocking() {}
	
	public static SingletonDoubleLocking singleton() {
		if(singleton_instance == null) {
			synchronized(SingletonDoubleLocking.class) {
				if(singleton_instance == null) {
					singleton_instance = new SingletonDoubleLocking();
				}
			}
		}
		return singleton_instance;
	}
}
