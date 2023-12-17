public class SingletonLazy {

    private static SingletonLazy singletonLazy;
    
    //private constructor to restrict multiple object creation
    private SingletonLazy(){
    }
    
    public static SingletonLazy getSingletonLazy(){
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}