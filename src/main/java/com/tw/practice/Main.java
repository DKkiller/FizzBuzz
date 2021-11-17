package com.tw.practice;

public class Main {
    /**
     * report the number
     * @param studentCount count of students
     */
    public static void print(Integer studentCount) {
        for (int studentPosition = 1; studentPosition <= studentCount; studentPosition++) {
            System.out.println(isContains3Or5Or7(studentPosition));
        }
    }

    /**
     * Determine whether the position of student contains 3 or 5 or 7
     * @param studentPosition position of student
     * @return if contains, report Fizz,Buzz or Whizz, else report the number of position
     */
    public static String isContains3Or5Or7 (Integer studentPosition) {
        String position = String.valueOf(studentPosition);
        if (position.contains("7"))
            return isMultiplesOf3Or7(studentPosition);
        else if (position.contains("5"))
            return isMultiplesOf5Or7(studentPosition);
        else if (position.contains("3"))
            return "Fizz";
        else
            return isMultiplesOf3Or5Or7(studentPosition);
    }

    /**
     * Determine whether the student position is a both multiple of 3, 5, 7
     * @param studentPosition The student reporting the count
     * @return if the position of student is Multiples of 3 or 5 or 7 or both ,this student report the word ,
     * not number of position
     */
    public static String isMultiplesOf3Or5Or7(Integer studentPosition) {
        if (studentPosition % 3 != 0 && studentPosition % 5 != 0 && studentPosition % 7 != 0){
            return String.valueOf(studentPosition);
        } else {
            StringBuilder report = new StringBuilder();
            if (studentPosition % 3 == 0)
                report.append("Fizz");
            if (studentPosition % 5 == 0)
                report.append("Buzz");
            if (studentPosition % 7 == 0)
                report.append("Whizz");
            return report.toString();
        }
    }

    /**
     * Determine whether the student position is a both multiple of 5, 7
     * @param studentPosition The student reporting the count
     * @return if the position of student is Multiples of 5 or 7 or both ,this student report the word ,
     * not number of position
     */
    public static String isMultiplesOf5Or7(Integer studentPosition) {
        if (studentPosition % 5 != 0 && studentPosition % 7 != 0){
            return String.valueOf(studentPosition);
        } else {
            StringBuilder report = new StringBuilder();
            if (studentPosition % 5 == 0)
                report.append("Buzz");
            if (studentPosition % 7 == 0)
                report.append("Whizz");
            return report.toString();
        }
    }

    /**
     * Determine whether the student position is a both multiple of 3, 7
     * @param studentPosition The student reporting the count
     * @return if the position of student is Multiples of 3 or 7 or both ,this student report the word ,
     * not number of position
     */
    public static String isMultiplesOf3Or7(Integer studentPosition) {
        if (studentPosition % 3 != 0 && studentPosition % 7 != 0){
            return String.valueOf(studentPosition);
        } else {
            StringBuilder report = new StringBuilder();
            if (studentPosition % 3 == 0)
                report.append("Fizz");
            if (studentPosition % 7 == 0)
                report.append("Whizz");
            return report.toString();
        }
    }
}
