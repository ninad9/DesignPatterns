import java.util.Objects;

public class DeveloperClient {

    public static void main(String[] args) {

        Employee emp1 = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(Objects.requireNonNull(emp1).salary());

        Employee emp2 = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(Objects.requireNonNull(emp2).salary());
    }
}
