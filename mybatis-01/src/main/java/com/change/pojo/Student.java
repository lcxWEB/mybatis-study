package com.change.pojo;

/**
 * @author: lichunxia
 * @create: 2021-01-04 22:10
 */
public class Student {

    private int id;

    private String name;

    private int score;

    private String course;

    public Student() {
    }

    public Student(String name, int score, String course) {
        this.name = name;
        this.score = score;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", course='" + course + '\'' +
                '}';
    }
}
