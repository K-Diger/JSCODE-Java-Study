package src.class7;

public class GymServiceValidator {

    public void isEmailEnable(String inputValue) {
        if (!inputValue.contains("@")) {
            throw new IllegalArgumentException("이메일 형식이 올바르지 않습니다.");
        }
    }

    public void isNameEnable(String inputValue) {
        final String regex = "[0-9]+";
        if (inputValue.matches(regex)) {
            throw new IllegalArgumentException("이름 형식이 올바르지 않습니다.");
        }
    }

    public int isParameterInteger(String inputValue) {
        final int temp;
        try {
            temp = Integer.parseInt(inputValue);
        } catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("정수로만 입력 가능합니다.");
        }
        return temp;
    }
}
