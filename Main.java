class Student {
    int id;
    int rollNo;
    String name;

    Student(int i, int r, String n) {
        id = i;
        rollNo = r;
        name = n;
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(420, 23, "Krishna");
        s1.show();
    }
}
