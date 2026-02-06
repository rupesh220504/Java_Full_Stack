package CompanyQuestions;

public class FrequencyString {

	public static void main(String[] args) {
        String s = "banana";
        char ch = 'a';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                count++;
        }

        System.out.println("Frequency = " + count);
    }
}
