import java.io.Serializable;

public class SingletonLazy implements Cloneable, Serializable{

    private static SingletonLazy singletonLazy;
    
    //private constructor to restrict multiple object creation
    private SingletonLazy(){
        // To avoid breaking of Singleton pattern using Reflection API
        if(singletonLazy!=null)
            throw new RuntimeException("Singleton object already exists");
    }
    
    public static SingletonLazy getSingletonLazy(){
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    // To avoid breaking of Singleton pattern using Object Cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonLazy;
    }

    // To avoid breaking of Singleton pattern during Serialization-Deserialization
    public Object readResolve(){
        return singletonLazy;
    } 
    
    
}