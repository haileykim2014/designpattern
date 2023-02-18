package singleton;

public class Singleton {
//    private static Singleton uniqueInstance;

    private Singleton(){}

    //this is not protected
//    public static Singleton getInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

    //ver 1.cause poor performance
//    public static synchronized Singleton getInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

    //ver 2.
//    private static Singleton uniqueInstance = new Singleton();
//    public static Singleton getInstance(){
//        return uniqueInstance;
//    }

    //ver 3.
    private volatile static Singleton uniqueInstance;

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }


}
