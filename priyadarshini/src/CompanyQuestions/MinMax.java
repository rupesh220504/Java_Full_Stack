package CompanyQuestions;

public class MinMax {

	public static void main(String[] args) {
        int[] a = {4, 7, 1, 9};

        int min = a[0], max = a[0];

        for (int x : a) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
