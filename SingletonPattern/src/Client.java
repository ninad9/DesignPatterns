import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

public static void main(String[] args) { 

    SingletonEnum se1 = SingletonEnum.INSTANCE;

    try {
        Constructor<SingletonEnum> constructor = SingletonEnum.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonEnum se2 = constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | NoSuchMethodException | SecurityException e) {
        e.printStackTrace();
    }
}

}
