package com.practice4.treeSet;

public class Student {
    private String name;
    private int chineseGrade;
    private int mathGrade;

    public Student() {
    }

    public Student(String name, int chineseGrade, int mathGrade) {
        this.name = name;
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseGrade=" + chineseGrade +
                ", mathGrade=" + mathGrade +
                '}';
    }
}
