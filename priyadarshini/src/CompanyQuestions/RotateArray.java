package CompanyQuestions;

public class RotateArray {

	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int k = 2;

        for (int i = 0; i < k; i++) {
            int first = a[0];
            for (int j = 0; j < a.length - 1; j++)
                a[j] = a[j + 1];
            a[a.length - 1] = first;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
