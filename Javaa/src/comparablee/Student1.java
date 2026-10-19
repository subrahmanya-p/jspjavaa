package comparablee;

import java.util.*;

class Student1 implements Comparable<Student1> {
    String name;

    Student1(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student1 s) {
        return this.name.length() - s.name.length();
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Student1> l1 = new ArrayList<>();

        l1.add(new Student1("Subbu"));
        l1.add(new Student1("Ram"));
        l1.add(new Student1("Krishna"));
        l1.add(new Student1("Anu"));

        Collections.sort(l1);

        for (Student1 s : l1) {
            System.out.println(s);
        }
    }
}