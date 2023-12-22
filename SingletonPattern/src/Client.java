public class Client {

    public static void main(String[] args) { 

        SingletonLazy sl1 = SingletonLazy.getSingletonLazy();
        System.out.println(sl1.hashCode());

        try {
                SingletonLazy sl2 = (SingletonLazy) sl1.clone();
                System.out.println(sl2.hashCode());
            } catch (CloneNotSupportedException e) {    
                e.printStackTrace();
            }
    }

}
