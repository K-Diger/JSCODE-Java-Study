package src.class6;

public class Starter {

    private final PhoneNumberValidator phoneNumberValidator;
    private final InputAgent inputAgent;
    private final PrintAgent printAgent;

    private boolean isContinued = true;

    public Starter(PhoneNumberValidator phoneNumberValidator, InputAgent inputAgent,
        PrintAgent printAgent) {
        this.phoneNumberValidator = phoneNumberValidator;
        this.inputAgent = inputAgent;
        this.printAgent = printAgent;
    }

    public void start() {
        while (isContinued) {
            try {
                printAgent.executeInputGuide();
                String input = inputAgent.execute();

                phoneNumberValidator.executeNumberLength(input);
                phoneNumberValidator.executePreSignedNumber(input);
                phoneNumberValidator.executeCanConvertInteger(input);

                printAgent.executeSuccessGuide();
                printAgent.executeInputPhoneNumber(input);
                isContinued = false;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            }
        }
    }
}
