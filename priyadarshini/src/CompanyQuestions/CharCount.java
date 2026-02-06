package CompanyQuestions;

public class CharCount {

	public static void main(String[] args) {
        String s = "java";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            System.out.println(s.charAt(i) + " = " + count);
        }
    }
}
