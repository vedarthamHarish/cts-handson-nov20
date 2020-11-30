import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Tlist {
	
	public static void main(String[] args) {
		User user = new User();
	    List<User> list = new ArrayList();
	    list.add(new User(1,"LG","lg123"));
	    list.add(new User(2,"Moto","moto123"));
	    list.add(new User(3,"MicroNokia","nokia123"));
	    list.add(new User(4,"Samsung","samsung123"));
	    list.add(new User(5,"Apple","apple123"));
	
	for(User s : list) {
		if(s.getName().length() >5) {
			System.out.println(s.getName());
		}

}
	}
}
