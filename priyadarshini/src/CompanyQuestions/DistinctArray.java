package CompanyQuestions;

public class DistinctArray {

	public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4};

        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(a[i] + " ");
        }
    }
}
