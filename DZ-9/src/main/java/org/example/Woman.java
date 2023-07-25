package org.example;

public class Woman extends Person{
    // Дівлче прізвище
    private String previousLastName;

    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
        this.previousLastName = lastName;
    }

    // Метод isRetired, який повертає true, якщо вік персони більше або дорівнює 60 (пенсійний вік)
    public boolean isRetired() {
        return age >= 60;
    }

    // Метод registerPartnership, який приймає об'єкт типу Man - як параметр і встановлює його,
    // як партнера для поточного об'єкта і навпаки, а також змінює прізвище жінки на прізвище чоловіка
    public void registerPartnership(Man man) {
        this.setPartner(man);
        man.setPartner(this);
        this.setLastName(man.getLastName()); // Змінюємо прізвище жінки на прізвище чоловіка
    }

    public void deregisterPartnership(boolean restoreLastName) {
        if (this.getPartner() != null) {
            Man man = (Man) this.getPartner();
            this.setPartner(null);
            man.setPartner(null);
            if (restoreLastName) {      // Якщо параметр true, то повертаємо прізвище жінки до попереднього стану
                this.restoreLastName();
            }
        }
    }

    // Метод restoreLastName, який встановлює поточне прізвище рівним попередньому
    public void restoreLastName() {
        this.setLastName(this.previousLastName);
    }
}
