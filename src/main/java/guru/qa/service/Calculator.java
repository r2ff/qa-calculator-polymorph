package guru.qa.service;

public class Calculator {

    private final Reader reader;
    private final Writer writer;


    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(Messages.ENTER_TWO_NUMBERS.getS());
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString(Messages.ENTER_OPERATOR.getS());
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first,second);
        writer.handleString(Messages.RESULT.getS());
        return (first + " " + po.getSymbol() + " " + second + " = " + sum);
    }

}
