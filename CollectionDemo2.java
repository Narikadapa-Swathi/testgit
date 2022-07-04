import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {

	public static Integer getMaxNumber(List<Integer> l1) {
		//get maximum number from the list
		// your code
		
		return Collections.max(l1);
	}

	public static List<Integer> getReversedList(List<Integer> l1) {
		//reverse the list and return
		// your code
		Collections.reverse(l1);
		return l1;
	}
	
	public static List<Integer> getOrderedList(List<Integer> l1) {
		// return the ordered list [ascending order]
		// your code
		
		Collections.sort(l1);
		return l1;
	}
	
	public static int getExactMidNumber(List<Integer> l1) {
		// return the mid number after sorting
		// NOTE : if the list size is odd, return the exact mid,
		//ex : after sorting, the list will be [32,48,145,202,598], the exact mid number is 145

		int mid = 0;
		Collections.sort(l1);
		for(int i=0;i<=l1.size();i++) {
			 mid=l1.size()/2;
			 l1.get(mid);
			
		}
		

		//if the list size is even, return the max number from the mid numbers 
		//EX: [10,14,54,76,234,123] => mids are [54,76] => as 76 is greater return 76
		// your code
		List<Integer> mid=Collection.sort(l1);
		
		if(l1.size()%2==0){
		    for(int i=0;i<l1.size();i++){
			mid=l1.size()/2;
			l1.get(Collections.max(mid));
		    }
		}
		return l1;
		

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(145);
		list1.add(202);
		list1.add(32);
		list1.add(48);
		list1.add(598);

		System.out.println(getMaxNumber(list1)); 
		System.out.println( getReversedList(list1));
		System.out.println(getOrderedList(list1));
		System.out.println( getMaxNumber(list1));
		System.out.println(getExactMidNumber(list1));

	}
}
