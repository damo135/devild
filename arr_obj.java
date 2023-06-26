class Student {
    int rno;
    String name;

    public void get(int x, String str) {
        rno = x;
        name = str;
    }

    public void put() {
        System.out.println("Roll No: " + rno);
        System.out.println("Name: " + name);
    }
}

public class arr_obj {
    public static void main(String args[]) {
        Student[] s = new Student[5];
        s[0] = new Student();
        s[0].get(33, "Damo");
        s[0].put();

        s[1] = new Student();
        s[1].get(43, "Damod");
        s[1].put();
    }
}