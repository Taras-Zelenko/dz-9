package org.example;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
    }

    // Метод isRetired, який повертає true, якщо вік персони більше або дорівнює 65 (пенсійний вік)
    public boolean isRetired() {
        return age >= 65;
    }

    // Метод registerPartnership, який приймає об'єкт типу Woman - як параметр і встановлює його,
    // як партнера для поточного об'єкта і навпаки, а також змінює прізвище жінки на прізвище чоловіка
    public void registerPartnership(Woman woman) {
        this.setPartner(woman);
        woman.setPartner(this);
        woman.setLastName(this.getLastName()); // Змінюємо прізвище жінки на прізвище чоловіка
    }

    public void deregisterPartnership(boolean restoreLastName) {
        if (this.getPartner() != null) { // Перевіряємо, чи є у персони партнер
            Woman woman = (Woman) this.getPartner();
            this.setPartner(null);
            woman.setPartner(null);
            if (restoreLastName) {      // Якщо параметр true, то повертаємо прізвище жінки до попереднього стану
                woman.restoreLastName();
            }
        }
    }
}
