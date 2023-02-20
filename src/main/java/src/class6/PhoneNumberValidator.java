package src.class6;

import static java.lang.Integer.parseInt;

public class PhoneNumberValidator {

    protected void executeCanConvertInteger(String input) {
        try {
            int number = parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException("휴대폰 번호는 숫자여야 합니다.");
        }
    }

    protected void executePreSignedNumber(String input) {
        if (!input.startsWith("010")) {
            throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야합니다.");
        }
    }

    protected void executeNumberLength(String input) {
        if (input.length() != 11) {
            throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
        }
    }
}
