package src.class7;

public class GymService {

    private final GymPrintAgent gymPrintAgent;
    private final GymInputAgent gymInputAgent;
    private final MemberRepository memberRepository;
    private final GymServiceValidator gymServiceValidator;

    public GymService(
        GymPrintAgent gymPrintAgent,
        GymInputAgent gymInputAgent,
        MemberRepository memberRepository,
        GymServiceValidator gymServiceValidator) {
        this.gymPrintAgent = gymPrintAgent;
        this.gymInputAgent = gymInputAgent;
        this.memberRepository = memberRepository;
        this.gymServiceValidator = gymServiceValidator;
    }

    // 이게 퍼사드가 맞나...?
    public void facade(String inputManual) {
        if (inputManual.equals("1")) {
            enroll();
        } else if (inputManual.equals("2")) {
            findMember();
        }
    }

    private void enroll() {
        String inputEmail = "";
        try {
            gymPrintAgent.inputEmailGuide();
            inputEmail = gymInputAgent.input();
            gymServiceValidator.isEmailEnable(inputEmail);
        } catch (IllegalArgumentException illegalArgumentException) {
            gymPrintAgent.illegalArgumentExceptionPrinter(illegalArgumentException);
            return;
        }

        String inputName = "";
        try {
            gymPrintAgent.inputNameGuide();
            inputName = gymInputAgent.input();
            gymServiceValidator.isNameEnable(inputName);
        } catch (IllegalArgumentException illegalArgumentException) {
            gymPrintAgent.illegalArgumentExceptionPrinter(illegalArgumentException);
            return;
        }

        int inputAge = 0;
        int ptTime = 0;
        try {
            gymPrintAgent.inputAgeGuide();
            inputAge = gymServiceValidator.isParameterInteger(gymInputAgent.input());

            gymPrintAgent.inputPtTimeGuide();
            ptTime = gymServiceValidator.isParameterInteger(gymInputAgent.input());

        } catch (NumberFormatException numberFormatException) {
            gymPrintAgent.numberFormatExceptionPrinter(numberFormatException);
            return;
        }

        try {
            memberRepository.save(new Member(inputEmail, inputName, inputAge, ptTime));
        } catch (IllegalArgumentException illegalArgumentException) {
            gymPrintAgent.illegalArgumentExceptionPrinter(illegalArgumentException);
            return;
        }

        gymPrintAgent.registerSuccessGuide();
    }

    private void findMember() {
        gymPrintAgent.inputSearchedTargetUserGuide();
        Member member = memberRepository.findByName(gymInputAgent.input());
        if (member == null) {
            gymPrintAgent.illegalArgumentExceptionPrinter(
                new IllegalArgumentException("존재하지 않은 회원입니다.")
            );
        } else {
            gymPrintAgent.memberInformation(member);
        }
    }
}
