package src.class4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(main.initLibrary());
    }

    public void run(Library library) {
        Scanner scanner = new Scanner(System.in);
        int booksCount = library.borrow(Integer.parseInt(scanner.nextLine()));
        while (booksCount != 0) {
            booksCount = library.borrow(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("모든 책이 대여되었습니다. 도서관 영업을 마칩니다 !");
    }

    public Library initLibrary() {
        Library library = new Library();
        library.printBorrowGuide(library.makeExampleBooks());
        return library;
    }
}