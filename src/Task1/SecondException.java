package Task1;

public class SecondException extends Exception {

    public SecondException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        System.out.println("{getMessage}: Перепроверте ввод данных для избежания \"SecondException\"");
        return super.getMessage();
    }
}
