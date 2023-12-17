public class ManagerFactory extends EmployeeAbstractFactory {

    @Override
    Employee getEmployee() {
        return new Manager();
    }
    
    
}
