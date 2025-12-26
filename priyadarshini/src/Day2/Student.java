package Day2;

class Student {
    int id;
    String name;
    int marks;

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Amit";
        s1.marks = 85;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Rohit";
        s2.marks = 78;

        s1.display();
        s2.display();
    }
}

