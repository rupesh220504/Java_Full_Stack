package CompanyQuestions;

public class RemoveDuplicates {

	public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};

        for (int i = 0; i < a.length; i++) {
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup)
                System.out.print(a[i] + " ");
        }
    }
}
