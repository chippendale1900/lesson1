package ru.geekbrains.lesson5;

public class Employee {
        String Name;
        String Position;
        String Email;
        String PhoneNumber;
        int Salary;
        int Age;

        public Employee(String valueName, String valuePosition, String valueEmail, String valuePhoneNumber, int valueSalary, int valueAge) {
            this.Name = valueName;
            this.Position = valuePosition;
            this.Email = valueEmail;
            this.PhoneNumber = valuePhoneNumber;
            this.Salary = valueSalary;
            this.Age = valueAge;
        }

        public String getName() {
        return Name;
        }
        public String getPosition() {
        return Position;
        }
        public String getEmail() {
        return Email;
        }
        public String getPhoneNumber() {
         return PhoneNumber;
        }
        public int getSalary() {
            return Salary;
        }
        public int getAge() {
            return Age;
        }

}



