package comparablee;

import java.util.*;

class City implements Comparable<City> {
    String city;

    City(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(City c) {
        return this.city.compareTo(c.city);
    }

    @Override
    public String toString() {
        return city;
    }

    public static void main(String[] args) {
        List<City> l1 = new ArrayList<>();

        l1.add(new City("Mangalore"));
        l1.add(new City("Bangalore"));
        l1.add(new City("Puttur"));
        l1.add(new City("Mysore"));

        Collections.sort(l1);

        for (City c : l1) {
            System.out.println(c);
        }
    }
}