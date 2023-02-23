package src.class7;

public class DependencyFactory {

    private static final GymPrintAgent GYM_PRINT_AGENT = new GymPrintAgent();
    private static final GymInputAgent GYM_INPUT_AGENT = new GymInputAgent();
    private static final MemberRepository memberRepository = new MemberRepository();
    private static final GymServiceValidator gymServiceValidator = new GymServiceValidator();
    private static final GymService gymService =
        new GymService(
            GYM_PRINT_AGENT, GYM_INPUT_AGENT, memberRepository, gymServiceValidator
        );

    private static final GymStarter gymStarter =
        new GymStarter(gymService, GYM_PRINT_AGENT, GYM_INPUT_AGENT);

    public static GymStarter getGymStarter() {
        return gymStarter;
    }
}
