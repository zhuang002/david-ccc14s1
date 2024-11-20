import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int round = sc.nextInt();
		
		for (int i=1;i<=k;i++) {
			list.add(i);
		}
		
		for (int i=0;i<round;i++) {
			int r = sc.nextInt();
			doRound(r);
		}
		
		for (int ele:list) {
			System.out.println(ele);
		}

	}
	
	
	private static void doRound(int r) {
		/** Wrong implementation because the arraylist index will change after you remove element.
		 * 
		 * 	int index = r-1;
			while (index < list.size()) {
			list.remove(index);
			index += r;
		}
		 */
		/**
		 * we remove from the tail so that the previous index won't change.
		 */
		int lastIndex = list.size() - (list.size() % r); // calculate the last index to be removed.
		// int lastIndex = (list.size()/r)*r;
		while (lastIndex>0) {
			list.remove(lastIndex);
			lastIndex -= r;
		}
		 
	}

}
