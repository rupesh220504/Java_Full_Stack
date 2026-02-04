package Day02_01_26_Interface;

import java.util.Scanner;

public class CodeCalciApp {

    // RupeshSoftwares ke liye duty (hard coded)
    public static void duty(CodeCalci c) {
        c.add();
        c.sub();
        c.mul();
        c.div();
    }

    // AyushInfotech ke liye duty (user input)
    public static void duty(CodeCalci c, char ch, int a, int b) {

        switch (ch) {
            case '+': c.add(a, b); break;
            case '-': c.sub(a, b); break;
            case '*': c.mul(a, b); break;
            case '/':
                if (b != 0)
                    c.div(a, b);
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("---- RupeshSoftwares (Hard Coded) ----");
        CodeCalci obj1 = new RupeshSoftwares();
        duty(obj1);

        System.out.println("\n---- AyushInfotech (User Input) ----");

        System.out.print("Enter value of a: ");
        int a = scan.nextInt();

        System.out.print("Enter value of b: ");
        int b = scan.nextInt();

        System.out.print("Choose operation (+ - * /): ");
        char ch = scan.next().charAt(0);

        CodeCalci obj2 = new AyushInfotech();
        duty(obj2, ch, a, b);

        scan.close();
    }
}

/* ================= RupeshSoftwares ================= */
class RupeshSoftwares extends Object implements CodeCalci {

    int a = 20;
    int b = 10;

    public void add() {
        System.out.println("Rupesh Add = " + (a + b));
    }

    public void sub() {
        System.out.println("Rupesh Sub = " + (a - b));
    }

    public void mul() {
        System.out.println("Rupesh Mul = " + (a * b));
    }

    public void div() {
        System.out.println("Rupesh Div = " + (a / b));
    }

    // Interface ke kaaran compulsory (use nahi honge)
    public void add(int a, int b) {}
    public void sub(int a, int b) {}
    public void mul(int a, int b) {}
    public void div(int a, int b) {}
}

/* ================= AyushInfotech ================= */
class AyushInfotech implements CodeCalci {

    // compulsory but unused
    public void add() {}
    public void sub() {}
    public void mul() {}
    public void div() {}

    public void add(int a, int b) {
        System.out.println("Ayush Add = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Ayush Sub = " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Ayush Mul = " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Ayush Div = " + (a / b));
    }
}