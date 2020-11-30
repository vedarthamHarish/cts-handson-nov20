import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		EmployeeService ser = new EmployeeService();
		do {
		Scanner sc = new Scanner(System.in);
        System.out.println("1.Add 2: Display Id 3: Display All 4: Sort by id 5: Sort by dob 6: Sort by salary 7: Sort by name 8: Exit");
		 a = sc.nextInt();
        	switch(a) {
        	case 1 :ser.add(new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next()));
        	break;
        	case 2 :System.out.println(ser.findbyId(sc.nextInt()));
        	break;
        	case 3 :System.out.println(ser.getEmployees());
        	break;
        	case 4 :System.out.println(ser.sortedbyId());
        	break;
        	case 5 :System.out.println(ser.sortedEmployeebyDob());
        	break;
        	case 6 :System.out.println(ser.sortedEmployeebySalary());
        	break;
        	case 7 :System.out.println(ser.sortedEmployeebyName());
        	}
        }while(a!=8);
		
	}

}
