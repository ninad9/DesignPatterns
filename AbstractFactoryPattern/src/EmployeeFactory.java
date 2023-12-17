/**
 * EmployeeFactory
 */
public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory empAbsFactory){
        return empAbsFactory.getEmployee();

    }
}