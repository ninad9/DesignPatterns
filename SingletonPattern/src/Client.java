public class Client {

    public static void main(String[] args) { 
    
        SingletonLazy sl1 = SingletonLazy.getSingletonLazy();
        SingletonLazy sl2 = SingletonLazy.getSingletonLazy();
        // both objects have same hashcode
        System.out.println(sl1.hashCode());
        System.out.println(sl2.hashCode());

        SingletonEager se1 = SingletonEager.getSingletonEager();
        SingletonEager se2 = SingletonEager.getSingletonEager();
        // both objects have same hashcode
        System.out.println(se1.hashCode());
        System.out.println(se2.hashCode());

        ThreadSafeSingleton tss1 = ThreadSafeSingleton.getThreadSafeSingleton();
        ThreadSafeSingleton tss2 = ThreadSafeSingleton.getThreadSafeSingleton();
        // both objects have same hashcode
        System.out.println(tss1.hashCode());
        System.out.println(tss2.hashCode());
    }
    
}
