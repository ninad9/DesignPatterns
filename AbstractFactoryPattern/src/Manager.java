public class Manager implements Employee {

    @Override
    public String name() {
        return "Manager";
    }

    @Override
    public int salary() {
        return 60000;
    }
    
    
}
