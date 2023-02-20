package src.class6;

public class PrintAgent {

    protected void executeInputGuide() {
        System.out.println("휴대폰 번호를 입력해주세요.");
    }

    protected void executeSuccessGuide() {
        System.out.print("휴대폰 번호를 정상적으로 입력하셨습니다. ");
    }

    protected void executeInputPhoneNumber(String phoneNumber) {
        System.out.println(
            "입력하신 휴대폰 번호는 " + phoneNumber.substring(0, 3) +
                "-" + phoneNumber.substring(3, 7) +
                "-" + phoneNumber.substring(7, 11) +
                "입니다."
        );
    }
}
