package com.example.mybd;

public class Student {
    private String name;
    private int weight;
    private int height;
    private int age;

    public Student(String name, int weight, int height, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}
