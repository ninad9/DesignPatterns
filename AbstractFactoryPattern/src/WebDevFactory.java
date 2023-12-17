public class WebDevFactory extends EmployeeAbstractFactory {
    
    @Override
    Employee getEmployee() {
    return new WebDeveloper();
}
    
}
