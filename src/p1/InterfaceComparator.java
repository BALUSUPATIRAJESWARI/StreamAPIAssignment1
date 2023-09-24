package p1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InterfaceComparator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(456);
		list.add(67);
		list.add(41);
		list.add(67);
		list.add(1355);
		Comparator<Integer> com = (a,b)-> {
			return a.compareTo(b);
		};		
		list.sort(com);	
		System.out.println(list);
	}
}