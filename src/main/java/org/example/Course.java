package org.example;

import java.util.ArrayList;
import java.util.List;


public class Course {

    /**
     * Represents  total number of courses
     */
    private static int totalCourses = 0;

    /**
     * Represents the name of the course.
     */
    private String courseName;

    /**
     * Represents the maximum capacity of the course.
     */
    private final int capacity;

    /**
     * Represents the list of students enrolled in the course.
     */
    private List<Student> students = new ArrayList<>();


    /**
     * Initializes a new Course instance with specified name and capacity
     *
     * @param name     The name of the course
     * @param capacity The capacity of the course
     */
    public Course(final String name, final int capacity) {
        courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    /**
     * Adds a student to the course if there is available space
     *
     * @param student   add student
     */
    public void addStudent(final Student student) {
        if (students.size() < capacity) {
            students.add(student);
        }
    }

    /**
     * Retrieves the list of students enrolled in the course
     *
     * @return The list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Retrieves the name of the course
     *
     * @return The name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Gets the total number of courses
     *
     * @return The total number of courses
     */
    public static int getTotalCourses() {
        return totalCourses;
    }
}
