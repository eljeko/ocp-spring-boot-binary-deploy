package hello;

public class Hello {

    private final String message;
    private final String greetings;

    public Hello(String message, String external_message) {
        this.message = message;
        this.greetings = external_message;
    }

    public String getMessage() {
        return message;
    }

    public String getGreetings() {
        return greetings;
    }
}
