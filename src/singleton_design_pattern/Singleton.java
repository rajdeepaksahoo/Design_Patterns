package singleton_design_pattern;

public class Singleton {
	
    private static Singleton singletonInstance;
    
    private Singleton(){

    }
    private Singleton(Singleton singleton){

    }
    public static Singleton getSingleton(){
        if(singletonInstance==null){
            synchronized (Singleton.class){
                if(singletonInstance==null){
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}
