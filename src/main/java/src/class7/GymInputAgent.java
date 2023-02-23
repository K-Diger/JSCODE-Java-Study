package src.class7;

import java.util.Scanner;

public class GymInputAgent {

    private final Scanner scanner = new Scanner(System.in);

    public String input() {
        return scanner.nextLine();
    }
}
