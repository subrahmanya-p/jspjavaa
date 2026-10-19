package comparablee;

import java.util.*;

class DOB implements Comparable<DOB> {
    int year;

    DOB(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(DOB d) {
        return this.year - d.year;
    }

    @Override
    public String toString() {
        return "DOB Year: " + year;
    }

    public static void main(String[] args) {
        List<DOB> l1 = new ArrayList<>();

        l1.add(new DOB(2005));
        l1.add(new DOB(2002));
        l1.add(new DOB(2004));
        l1.add(new DOB(2003));

        Collections.sort(l1);

        for (DOB d : l1) {
            System.out.println(d);
        }
    }
}