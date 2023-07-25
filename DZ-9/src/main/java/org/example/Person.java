package org.example;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public Person partner; // Поле типу Person для збереження партнера

    // Конструктор класу Person, який приймає чотири параметри
    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
    }

    // Геттери і сеттери для полів firstName, lastName і age
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Геттер і сеттер для поля partner
    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
}