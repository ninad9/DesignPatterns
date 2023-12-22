import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

    public static void main(String[] args) { 

        SingletonLazy sl1 = SingletonLazy.getSingletonLazy();
        System.out.println(sl1.hashCode());
        try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.object"));
                oos.writeObject(sl1);
                System.out.println("serialization done...");

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.object"));
                SingletonLazy sl2 = (SingletonLazy) ois.readObject();
                System.out.println(sl2.hashCode());
            } catch (IOException | ClassNotFoundException e) {    
                e.printStackTrace();
            }
    }

}
