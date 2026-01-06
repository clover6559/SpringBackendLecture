package org.example.head03_OOP.example7;

public class InheritanceTest {
    public static void main(String[] args) {
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();

        User b = new BusinessUser("U002","big", "PRE");
        b.printUserInfo();
    }
}