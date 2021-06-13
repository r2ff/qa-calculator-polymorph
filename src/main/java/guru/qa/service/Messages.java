package guru.qa.service;

public enum Messages {
    ENTER_TWO_NUMBERS("Enter 2 numbers: "),
    ENTER_OPERATOR("Enter operator (+, *, -, /, ^): "),
    RESULT("Result: ");

    private final String s;

    public String getS() {
        return s;
    }

    Messages(String s) {
        this.s = s;
    }
}
