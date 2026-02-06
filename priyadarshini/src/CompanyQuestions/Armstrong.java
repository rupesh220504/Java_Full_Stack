package CompanyQuestions;

public class Armstrong {

	public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;

        while (temp != 0) {
            int r = temp % 10;
            sum += r * r * r;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}
