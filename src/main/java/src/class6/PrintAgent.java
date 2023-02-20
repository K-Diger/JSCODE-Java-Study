package src.class6;

public class PrintAgent {

    protected void executeInputGuide() {
        System.out.println("휴대폰 번호를 입력해주세요.");
    }

    protected void executeSuccessGuide() {
        System.out.print("휴대폰 번호를 정상적으로 입력하셨습니다. ");
    }

    protected void executeInputPhoneNumber(String phoneNumberForm) {
        System.out.println("입력하신 휴대폰 번호는 " + phoneNumberForm + "입니다.");
    }
}
