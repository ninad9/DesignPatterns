import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

public static void main(String[] args) { 

    SingletonLazy sl1 = SingletonLazy.getSingletonLazy();

    try {
        Constructor<SingletonLazy> constructor = SingletonLazy.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazy sl2 = constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | NoSuchMethodException | SecurityException e) {
        e.printStackTrace();
    }
}

}
