package src.class3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhoIsNumberOneMain {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        double bestRecord = 0.0;
        double record = 0.0;
        int bestPlayerIndex = 0;
        execute(numbers, bestRecord, record, bestPlayerIndex);
    }

    private static void printInputNumberGuide() {
        System.out.println("선수의 번호를 입력하세요.");
    }

    private static void printInputRecordGuide() {
        System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");
    }

    private static void printBestRecordAndPlayer(int number, double record, int numbersLength) {
        System.out.println(
                "1등 : " + number + "번 선수 / "
                        + String.format("%.2f", record) + "초 (참가인원 : " + numbersLength + "명)");
    }

    private static String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        printInputNumberGuide();
        return scanner.nextLine();
    }

    private static String inputRecord() {
        Scanner scanner = new Scanner(System.in);
        printInputRecordGuide();
        return scanner.nextLine();
    }

    private static void execute(List<Integer> numbers, double bestRecord, double record, int bestRecordIndex) {
        int index = 0;
        while (true) {
            String inputValue = inputNumber();
            if (inputValue.equals("print")) {
                printBestRecordAndPlayer(numbers.get(bestRecordIndex), bestRecord, numbers.size());
                break;
            }

            if (numbers.contains(Integer.valueOf(inputValue))) {
                numbers.set(numbers.indexOf(Integer.valueOf(inputValue)), Integer.valueOf(inputValue));
            } else {
                numbers.add(Integer.valueOf(inputValue));
            }

            inputValue = inputRecord();
            record = Double.parseDouble(inputValue);
            index++;

            if (record > bestRecord) {
                bestRecord = record;
                bestRecordIndex = index;
            }
        }
    }
}
