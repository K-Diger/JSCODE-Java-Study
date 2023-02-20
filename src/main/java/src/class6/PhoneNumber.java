package src.class6;

public class PhoneNumber {

    private String phoneNumber;
    private String phoneNumberForm;

    private PhoneNumber() {
    }

    public PhoneNumber(String input) {
        this.phoneNumber = input;
    }

    private PhoneNumber(String input, String input2) {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String convertToPhoneNumber() {
        this.phoneNumberForm = phoneNumber.substring(0, 3) +
            "-" + phoneNumber.substring(3, 7) +
            "-" + phoneNumber.substring(7, 11);
        return phoneNumberForm;
    }
}
