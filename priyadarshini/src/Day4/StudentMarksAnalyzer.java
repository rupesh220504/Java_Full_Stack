package Day4;

public class StudentMarksAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studentName = "Rupesh";

        int[] marks = {80, 75, 85};   // 3 subjects

        int total = 0;

        for (int m : marks) {
            total += m;
        }

        int average = total / marks.length;

        String result;
        if (average >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        System.out.println("Student: " + studentName);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);

	}

}
