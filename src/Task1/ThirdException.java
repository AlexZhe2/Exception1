package Task1;

public class ThirdException extends Exception {
    public ThirdException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        System.out.println("{getMessage}: Перепроверте ввод данных для избежания \"ThirdException\"");
        return super.getMessage();
    }
}
