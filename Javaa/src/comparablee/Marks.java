package comparablee;

import java.util.*;

class Marks implements Comparable<Marks> {
    int mark;

    Marks(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Marks m) {
        return this.mark - m.mark;
    }

    @Override
    public String toString() {
        return String.valueOf(mark);
    }

    public static void main(String[] args) {
        List<Marks> l1 = new ArrayList<>();

        l1.add(new Marks(85));
        l1.add(new Marks(65));
        l1.add(new Marks(95));
        l1.add(new Marks(75));

        Collections.sort(l1);

        for (Marks m : l1) {
            System.out.println(m);
        }
    }
}