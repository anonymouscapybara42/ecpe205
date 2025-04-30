package com.ecpe308.sample;

public class Person {
    private String lastName, firstName, address;
    private int age;

    public Person() {

    };

    public Person(String lastName, String firstName, String address, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}