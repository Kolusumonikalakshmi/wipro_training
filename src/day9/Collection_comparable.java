package day9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				// TODO Auto-generated method stub
				
				if(i>j)return 1 ;
				else return -1;
				
			}
			
		};
		List<Integer> num = new ArrayList<>();
		num.add(79);
		num.add(93);
		num.add(84);
		num.add(86);
		num.add(80);
		System.out.println(num + " before sorting");

		Collections.sort(num,c);
		System.out.println(num + " after sorting");
		
		
		

	}

}
