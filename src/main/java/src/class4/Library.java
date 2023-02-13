package src.class4;

import static java.lang.Boolean.FALSE;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    private int booksCount = 0;

    public List<Book> makeExampleBooks() {
        Book book1 = new Book(1, "클린코드(Clean Code)", true);
        Book book2 = new Book(2, "객체지향의 사실과 오해", true);
        Book book3 = new Book(3, "테스트 주도 개발(TDD)", true);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        booksCount = books.size();
        return books;
    }

    public void printBorrowGuide(List<Book> books) {
        System.out.println("대여할 책의 번호를 입력하세요.");
        int i = 1;
        for (Book book : books) {
            if (isAvailableBorrow(book)) {
                System.out.println(i + ". " + book.getName() + " - " + "대여 가능");
            } else {
                System.out.println(i + ". " + book.getName() + " - " + "대여 중");
            }
            i++;
        }
    }

    public boolean isAvailableBorrow(Book book) {
        return book.getStatus();
    }

    public int borrow(Integer number) {
        if (books.get(number - 1).getStatus()) {
            System.out.println("정상적으로 대여가 완료되었습니다.");
            books.get(number - 1).setStatus(FALSE);
            booksCount--;
        } else {
            System.out.println("대여 중인 책은 대여할 수 없습니다.");
        }
        return booksCount;
    }

    public int getBooksCount() {
        return booksCount;
    }
}
