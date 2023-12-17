public class AndroidDevFactory extends EmployeeAbstractFactory {

    @Override
    Employee getEmployee() {
        return new AndroidDeveloper();
    }
    
}
