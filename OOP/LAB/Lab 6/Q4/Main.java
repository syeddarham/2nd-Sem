package Temp.Q4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.println("Enter the number of weeks: ");
        int numWeeks = scanner.nextInt();
        int[][] attendanceRecords = new int[numStudents][numWeeks];
        
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            for(int weekIndex = 0; weekIndex < numWeeks; weekIndex++) {
                int attendanceStatus = 0;
                System.out.println("Enter Attendance for Student" +(studentIndex + 1) +" for Week # :" + (weekIndex + 1));
                System.out.println("0-absent & 1-present:");
                attendanceStatus = scanner.nextInt();
                if(!(attendanceStatus == 0 || attendanceStatus == 1)) {
                    System.out.println("Invalid input");
                    weekIndex--;
                    continue;
                }
                attendanceRecords[studentIndex][weekIndex] = attendanceStatus;
            }
        }
        
        int[] totalPresentPerStudent = new int[numStudents];
        int[] totalAbsentPerStudent = new int[numStudents];
        
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            for(int weekIndex = 0; weekIndex < numWeeks; weekIndex++) {
                if(attendanceRecords[studentIndex][weekIndex] == 1) {
                    totalPresentPerStudent[studentIndex]++;
                } else {
                    totalAbsentPerStudent[studentIndex]++;
                }
            }
        }
        int overallPresentCount = 0;
        int overallAbsentCount = 0;
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            for(int weekIndex = 0; weekIndex < numWeeks; weekIndex++) {
                if(attendanceRecords[studentIndex][weekIndex] == 1) {
                    overallPresentCount++;
                } else {
                    overallAbsentCount++;
                }
            }
        }
        int averagePresents = overallPresentCount / numStudents;
        int averageAbsents = overallAbsentCount / numStudents;
        int maxPresent = totalPresentPerStudent[0];
        int maxAbsent = totalAbsentPerStudent[0];
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            if(maxPresent < totalPresentPerStudent[studentIndex]) {
                maxPresent = totalPresentPerStudent[studentIndex];
            }
        }
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            if(maxAbsent < totalAbsentPerStudent[studentIndex]) {
                maxAbsent = totalAbsentPerStudent[studentIndex];
            }
        }
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            System.out.println("Student #" + (studentIndex + 1) + " was present " + totalPresentPerStudent[studentIndex] + " times.");
            System.out.println("Student #" + (studentIndex + 1) + " was absent " + totalAbsentPerStudent[studentIndex] + " times.");
        }
        System.out.println("Total number of present days: " + overallPresentCount);
        System.out.println("Total number of absent days: " + overallAbsentCount);
        System.out.println("Average number of present days: " + averagePresents);
        System.out.println("Average number of absent days: " + averageAbsents);
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            if(maxPresent == totalPresentPerStudent[studentIndex]) {
                System.out.println("Student #" + (studentIndex + 1) + " has the highest attendance.");
                break;
            }
        }
        for(int studentIndex = 0; studentIndex < numStudents; studentIndex++) {
            if(maxAbsent == totalAbsentPerStudent[studentIndex]) {
                System.out.println("Student #" + (studentIndex + 1) + " has the lowest attendance.");
                break;
            }
        }
    }
}
