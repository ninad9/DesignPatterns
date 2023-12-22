public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;
    
    //private constructor to restrict multiple object creation
    private ThreadSafeSingleton(){
        // To avoid breaking of Singleton pattern using Reflection API
        if(threadSafeSingleton!=null)
            throw new RuntimeException("Singleton object already exists");
    }
    
    public static ThreadSafeSingleton getThreadSafeSingleton(){
        synchronized(ThreadSafeSingleton.class){
            if (threadSafeSingleton == null) {
                threadSafeSingleton = new ThreadSafeSingleton();
            }
        }
        return threadSafeSingleton;
    }
    
}
