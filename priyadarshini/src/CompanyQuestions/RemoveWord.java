package CompanyQuestions;

public class RemoveWord {

	public static void main(String[] args) {
        String s = "Java is easy";
        String word = "easy";

        s = s.replace(word, "");
        System.out.println(s);
    }
}
