package src.class6;

public class Main {

    public static void main(String[] args) {
        Starter starter = new Starter(
            new PhoneNumberValidator(), new InputAgent(), new PrintAgent());
        starter.start();
    }
}
