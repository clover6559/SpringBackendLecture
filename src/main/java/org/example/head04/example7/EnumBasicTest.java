package org.example.head04.example7;

public class EnumBasicTest {
    public enum Level {
        LOW, MEDIUM, HIGH
    }
    public static void main(String[] args) {
        for (Level lvl : Level.values()) {
            System.out.println(lvl + "ordinal = " + lvl.ordinal());
        }
        Level today = Level.MEDIUM;
        System.out.println("name(): " + today.name());
    }
}
