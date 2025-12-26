package Day8;

import java.util.Arrays;
import java.util.List;

public class Student_Marks_Processing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> marks = Arrays.asList(30, 45, 60, 35, 80);
		int totalMarks = marks.stream().filter(m -> m >= 40) 
				.map(m -> m + 5) 
				.reduce(0, Integer::sum); 
		
		System.out.println("Total Marks:-"+totalMarks);

	}

}
