import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tmap {

	public static void main(String[] args) {
		List<Student> ece = new ArrayList<>();
		List<Student> cse = new ArrayList<>();
		Map<String,List<Student>> map = new HashMap<String,List<Student>>();
		
		ece.add(new Student(1,"Harish"));
		ece.add(new Student(2,"vamsi"));
		cse.add(new Student(3,"asdf"));
		cse.add(new Student(4,"lkjh"));
		
		map.put("EC", ece);
		map.put("CS", cse);
		
		
		System.out.println(map);
	}

}
