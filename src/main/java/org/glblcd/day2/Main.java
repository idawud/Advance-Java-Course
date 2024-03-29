package org.glblcd.day2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main implements Runnable {
    private int count;
    private String name;
    private final LocalDate createdOn;

    public Main(final int count, String name) {
        this.count = count;
        this.name = name;
        this.createdOn = LocalDate.now();
    }

    public static void main(String[] args) {
        Main m = new Main(17, "dawud");
        //  m.run();
        Thread t = new Thread(m);
        t.start();
        for (PrimaryColour c : PrimaryColour.values()){
            System.out.println(c);
        }


        //************************************************************************
        // Running the custom List: Generics
        //************************************************************************

        MyList<String> theList = new MyList<String>();
        MyList<Person> people = new MyList<>();

        //************************************************************************
        // java inbuilt Collections
        //************************************************************************
        List<String> names = new ArrayList<>();

    }

    public void run() {
        System.out.println(this.toString());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Main{" +
                "count=" + count +
                ",name=" + name +
                ",createdOn=" + createdOn + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Main)) return false;
        Main main = (Main) o;
        return count == main.count &&
                Objects.equals(name, main.name) &&
                Objects.equals(createdOn, main.createdOn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(count, name, createdOn);
    }
}