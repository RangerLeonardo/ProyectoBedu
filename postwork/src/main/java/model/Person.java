package model;

import java.io.Serializable;

/**
 * Author: ♠ Brandon Leonardo Adata Barrera ♠
 * Date: 01/09/2024
 */
public class Person implements Serializable {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
