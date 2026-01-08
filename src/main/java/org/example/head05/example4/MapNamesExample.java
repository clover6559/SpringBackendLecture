//package org.example.head05.example4;
////2.2.1 실습 연습
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Function;
//
//public class MapNamesExample {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//
//        Function<String, String> nameLength = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        };
//        names.stream()
//                .map(<String> names.toString(names))
//                .forEach(Upper -> System.out.println("Name Uppercase: " + Upper));
//    }
//}
