package p1;

import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> stringFruit = (t)->{
			System.out.println(t);
			return true;
		};		
		String fruit[] = {"Papaya", "Apple", "Orange", "waterMelon"};
		for(String i : fruit) {
			stringFruit.test(i);
		}
	}
}
