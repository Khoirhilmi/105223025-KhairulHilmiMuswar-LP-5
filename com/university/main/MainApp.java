package com.university.main;

import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        // Membuat array objek Student berukuran 5 dengan data dummy
        Student[] students = new Student[5];
        
        students[0] = new Student("S001", "Alice", 20, 3.8);
        students[1] = new Student("S002", "Bob", 22, 3.6);
        students[2] = new Student("S003", "Charlie", 21, 3.9);
        students[3] = new Student("S004", "David", 19, 3.7);
        students[4] = new Student("S005", "Eve", 23, 3.5);

        // Mencetak header
        System.out.println("=== Data Mahasiswa ===");

        // Perulangan untuk mencetak semua data mahasiswa
        for (Student student : students) {
            System.out.printf("ID: %s, Nama: %s, Umur: %d, GPA: %.1f%n",
                    student.getStudentId(),
                    student.getName(),
                    student.getAge(),
                    student.getGpa());
        }
    }
}