package src.class7;

public class GymStarter {

    private final GymService gymService;
    private final GymPrintAgent gymPrintAgent;
    private final GymInputAgent gymInputAgent;

    public GymStarter(
        GymService gymService,
        GymPrintAgent gymPrintAgent,
        GymInputAgent gymInputAgent) {

        this.gymService = gymService;
        this.gymPrintAgent = gymPrintAgent;
        this.gymInputAgent = gymInputAgent;
    }

    public void execute() {
        while (true) {
            gymPrintAgent.selectManualGuide();
            String inputManual = gymInputAgent.input();
            gymService.facade(inputManual);

            // 이 부분부터
            gymPrintAgent.inputEndFlag();
            String endFlag = gymInputAgent.input();
            if (endFlag.equals("c")) {
                continue;
            } else if (endFlag.equals("q")) {
                break;
            } else {
                gymPrintAgent.basicStringPrint("잘 못 입력하셨습니다.");
                gymPrintAgent.inputEndFlag();
                endFlag = gymInputAgent.input();
            }
            // 여기까지 코드가 썩 맘에 들지 않는다. 더 좋은 방법은 뭐가 있었을까..
            // (Spring 의 Controller 계층이라고 생각하면 비즈니스 로직이 들어간 거 같아서 좀 찝찝하다.)
        }
    }
}
