import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
	List<Employee> emp = new ArrayList<>();
	public void add(Employee employee) {
		emp.add((Employee) employee);
	}
	public Employee findbyId(int id) {
		for(Employee e : emp) {
			if(id == e.getId()) {
				return e;
			}
		}
		return null;
	}
	
	public List<Employee> getEmployees() {
		return emp;
	}
	
	public List<Employee> sortedbyId() {
		Collections.sort(emp, new Comparator<Employee>() {
			public int compare(Employee e1,Employee e2) {
				return e1.getId() - e2.getId();
			}
		});
		return emp;
	}
	
	public List<Employee> sortedEmployeebySalary() {
		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.getSalary() - e2.getSalary());
				// TODO Auto-generated method stub
			}
			
		});
		return emp;
	}
	
	public List<Employee> sortedEmployeebyDob() {
		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getDob().compareTo(e2.getDob());
			}
			
		});
		return emp;
	}

	public List<Employee> sortedEmployeebyName() {
		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getName().compareTo(e2.getName());
			}
		});
		return emp;
	}
}
