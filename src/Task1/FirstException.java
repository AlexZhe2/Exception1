package Task1;

public class FirstException extends Exception {

    public FirstException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        System.out.println("{getMessage}: Перепроверте ввод данных для избежания \"FirstException\"");
        return super.getMessage();
    }
}
