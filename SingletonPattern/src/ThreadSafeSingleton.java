public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;
    
    //private constructor to restrict multiple object creation
    private ThreadSafeSingleton(){
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
