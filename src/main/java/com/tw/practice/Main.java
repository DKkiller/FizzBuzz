package com.tw.practice;

public class Main {
    /**
     * report the number
     * @param studentCount count of students
     */
    public static void print(Integer studentCount) {
        for (int studentPosition = 1; studentPosition <= studentCount; studentPosition++) {
            System.out.println(studentPosition);
        }
    }

    /**
     * Determine whether the student position is a both multiple of 3 and 5, 3 and 7, 5 and 7, or all 3 5 7
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
}
