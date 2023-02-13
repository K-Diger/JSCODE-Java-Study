package src.class3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PrintStudentMain {
    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        printGuideMessage();
        printStudents(inputStudents());
    }

    private static void printGuideMessage() {
        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. (한글로만 입력해야합니다.)");
        System.out.println("학생들을 다 입력했다면, print라고 입력해주세요.");
    }

    private static void printStudents(List<String> students) {
        System.out.println("[학생 명단(가나다순)]");
        for (String student : students) {
            System.out.println(student);
        }
    }

    private static void printWarning() {
        System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
    }

    private static List<String> inputStudents() {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();
        while (true) {
            String inputValue = scanner.nextLine();
            if (inputValue.equals("print")) {
                return sortStudents(students);
            } else if (Pattern.matches("^[a-zA-Z]*$", inputValue)) {
                printWarning();
            }
            students.add(inputValue);
        }
    }

    private static List<String> sortStudents(List<String> students) {
        Collections.sort(students);
        return students;
    }
}
