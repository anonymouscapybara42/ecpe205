package com.ecpe308.sample;

import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;
    private String address;
    private int age;
    
    public Person() {
    }

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

    @Override
    public String toString() {
        return String.format("Person[firstName=%s, lastName=%s, age=%d, address=%s]",
                firstName, lastName, age, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, address, age);
    }
}
