import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestItems {

	public static void main(String[] args) {
		List<Items> list = new ArrayList<>();
		list.add(new Items(200, "TV", 45000));
		list.add(new Items(100, "Mobile", 20000));
		list.add(new Items(300, "Laptop", 30000));
		for(Items item : list) System.out.println(item);
		
		Comparator<Items> IdSort = new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i1.getId() - i2.getId();
			}
		};
		System.out.println("Ascending Order");
		Collections.sort(list,IdSort);
		for(Items item : list) {
			System.out.println(item);
		}
		Comparator<Items> IdSortD = new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i2.getId() - i1.getId();
			}
		};
		System.out.println("Desending Order");
		Collections.sort(list,IdSortD);
		for(Items item : list) {
			System.out.println(item);
		}
		
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i2.getName().compareTo(i1.getName());
			}
		});
		System.out.println("Ascending Order");
		for(Items item : list) {
			System.out.println(item);
		}
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i1.getName().compareTo(i2.getName());
			}
		});
		System.out.println("Desending Order");
		for(Items item : list) {
			System.out.println(item);
		}
		
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return (int) (i1.getPrice() - i2.getPrice());
			}
		});
		System.out.println("Ascending Order");
		for(Items item : list) {
			System.out.println(item);
		}
		
		Collections.sort(list, new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return (int) (i2.getPrice() - i1.getPrice());
			}
		});
		System.out.println("Desending Order");
		for(Items item : list) {
			System.out.println(item);
		}
		// TODO Auto-generated method stub
        
	}

}
