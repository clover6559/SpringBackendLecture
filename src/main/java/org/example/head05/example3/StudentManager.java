package org.example.head05.example3;

import java.util.*;

//public class StudentManager {
//    private List<Student> students;
//    private Set<Student> studentName;
//    private Map<String, Integer> scoreMap;
//
//    public StudentManager() {
//        students = new ArrayList<>();
//        studentName = new HashSet<>();
//        scoreMap = new HashMap<>();
//    }
//    public void addStudent(String student, int score) {
//        if (studentName.contains(student.replace()) {
//            System.out.println("[ERROR] 이미 존재하는 학생 이름입니다.");
//            return;
//             }
//        student.add(student);
//        studentName.add(student.getName());
//        scoreMap.put(student.getName()(), score);
//        System.out.println("[INFO] 새로운 학생이 등록 되었습니다: " + student);
//     }
//    public void removeStudent(String name) {
//        Student target = null;
//        for (Student s: students) {
//            if(s.getName().equals(name)) {
//                target = s;
//                break;
//            }
//        }
//        if (target != null) {
//            students.remove(target);
//            studentName.remove(name);
//            scoreMap.remove(name);
//            System.out.println("[Info] 힉생이 삭제 되었습니다; " + name);
//        } else {
//            System.out.println("[Error] 해당 학생의 이름을 찾을 수 없습니다.");
//               }
//    }
//    public void printAllStudents() {
//        System.out.println("=== 학생 목록 ===");
//        for (Student s : students) {
//            System.out.println(s);
//        }
//    }
//    public void printScore(String name) {
//        Integer score = scoreMap.get(name);
//        if (score != null) {
//            System.out.println("[Info] " + name + "의 점수: " + score);
//        } else {
//            System.out.println("[Error] 점수를 찾을 수 없습니다.");
//        }
//    }
//    }
//
//}
