package src.class7;

public class GymPrintAgent {

    public void basicStringPrint(String message) {
        System.out.println(message);
    }

    public void selectManualGuide() {
        System.out.println("원하시는 번호를 입력해주세요.");
        System.out.println("1. 회원 등록");
        System.out.println("2. 회원 조회");
    }

    public void inputEmailGuide() {
        System.out.println("이메일을 입력해 주세요.");
    }

    public void inputNameGuide() {
        System.out.println("이름을 입력해 주세요.");
    }

    public void inputAgeGuide() {
        System.out.println("나이를 입력해 주세요.");
    }

    public void inputPtTimeGuide() {
        System.out.println("신청한 PT 횟수를 입력해주세요.");
    }

    public void registerSuccessGuide() {
        System.out.println("회원 등록이 성공적으로 완료되었습니다.");
    }

    public void inputEndFlag() {
        System.out.println("계속하시려면 c, 종료하시려면 q 를 입력해주세요.");
    }

    public void numberFormatExceptionPrinter(NumberFormatException numberFormatException) {
        System.out.println(numberFormatException.getMessage());
    }

    public void illegalArgumentExceptionPrinter(IllegalArgumentException illegalArgumentException) {
        System.out.println(illegalArgumentException.getMessage());
    }

    public void inputSearchedTargetUserGuide() {
        System.out.println("조회하려는 회원의 이름을 입력해주세요.");
    }

    public void memberInformation(Member member) {
        System.out.println(member.customToString(member));
    }
}
