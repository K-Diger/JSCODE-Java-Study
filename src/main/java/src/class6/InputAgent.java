package src.class6;

import java.util.Scanner;

public class InputAgent {

    private final Scanner scanner = new Scanner(System.in);

    protected String execute() {
        return scanner.nextLine();
    }
}
