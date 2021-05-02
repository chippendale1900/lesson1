package ru.geekbrains.lesson5;

public class Staff {
    public static void main (String[] args) {
        Employee employee1 = new Employee("Ivan Ivanov", "инженер", "iv_an@ivanov.ru", "89510877889", 34677, 34);
        System.out.println(employee1.getName());
        System.out.println(employee1.getPosition());
        System.out.println(employee1.getEmail());
        System.out.println(employee1.getPhoneNumber());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getAge());
    }
}
