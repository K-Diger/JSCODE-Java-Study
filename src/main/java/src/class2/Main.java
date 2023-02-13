package src.class2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 기인지 입력해주세요.");
        int number = scanner.nextInt();
        System.out.println("HTML 과목 점수를 입력해주세요.");
        int htmlScore = scanner.nextInt();
        System.out.println("CSS 과목 점수를 입력해주세요.");
        int cssScore = scanner.nextInt();
        System.out.println("JavaScript 과목 점수를 입력해주세요.");
        int javaScriptScore = scanner.nextInt();

        if (number >= 3) {
            testForThirdAndOver(htmlScore, cssScore, javaScriptScore);
            return;
        }
        testForFirstAndSecond(htmlScore, cssScore, javaScriptScore);
    }

    private static void testForFirstAndSecond(int htmlScore, int cssScore, int javaScriptScore) {
        int sum = htmlScore + cssScore + javaScriptScore;
        double average = sum / 3.0;
        if (average >= 60) {
            System.out.println("합격입니다.");
            printMaxValueAndMinValue(htmlScore, cssScore, javaScriptScore, average);
            return;
        }
        System.out.println("불합격입니다.");
        printMaxValueAndMinValue(htmlScore, cssScore, javaScriptScore, average);
    }

    private static void testForThirdAndOver(int htmlScore, int cssScore, int javaScriptScore) {
        int sum = htmlScore + cssScore + javaScriptScore;
        double average = sum / 3.0;
        if (judgementUnconditionalPass(htmlScore, cssScore, javaScriptScore) || average >= 70) {
            System.out.println("합격입니다.");
            printMaxValueAndMinValue(htmlScore, cssScore, javaScriptScore, average);
            return;
        }
        System.out.println("불합격입니다.");
        printMaxValueAndMinValue(htmlScore, cssScore, javaScriptScore, average);
    }

    private static double calcMaxValue(int htmlScore, int cssScore, int javaScriptScore) {
        double max = Math.max(htmlScore, cssScore);
        return Math.max(max, javaScriptScore);
    }

    private static double calcMinValue(int htmlScore, int cssScore, int javaScriptScore) {
        double min = Math.min(htmlScore, cssScore);
        return Math.min(min, javaScriptScore);
    }

    private static void printMaxValueAndMinValue(int htmlScore, int cssScore, int javaScriptScore, double average) {
        System.out.println("전체 과목 중 최고점은 " + calcMaxValue(htmlScore, cssScore, javaScriptScore) + "점입니다.");
        System.out.println("전체 과목 중 최저점은 " + calcMinValue(htmlScore, cssScore, javaScriptScore) + "점입니다.");
        System.out.println("전체 과목의 평균은 " + average + "점입니다.");
    }

    private static boolean judgementUnconditionalPass(int htmlScore, int cssScore, int javaScriptScore) {
        int count = 0;
        if (htmlScore == 100) {
            count++;
        }
        if (cssScore == 100) {
            count++;
        }
        if (javaScriptScore == 100) {
            count++;
        }
        return count >= 2;
    }
}
