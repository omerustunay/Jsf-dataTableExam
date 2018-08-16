package jsf.Exam.ctrl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import jsf.Exam.Bean.Employee;

@ManagedBean
@SessionScoped
public class UserController {

    private List<Employee> employees = null;
    private Employee selectedEmployee = null;

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    @PostConstruct
    public void init() {
        employees = new ArrayList<Employee>();
        employees.add(new Employee("omer", "ustunay", 1));
        employees.add(new Employee("ustunay", "omer", 2));

        selectedEmployee = new Employee();

    }

    public void select(Employee e) {

        selectedEmployee = e;
    }

    public void update() {
        selectedEmployee = new Employee();
    }

    public void delete() {
        employees.remove(selectedEmployee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
