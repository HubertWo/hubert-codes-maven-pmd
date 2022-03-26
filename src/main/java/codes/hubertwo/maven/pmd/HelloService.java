package codes.hubertwo.maven.pmd;

public class HelloService {

    public String hello(String name) {
        return buildMessage("Hello", name);
    }

    /**
     * This method is identical to {@link ByeService#buildMessage(String, String)}.
     */
    private String buildMessage(String name, String message) {
        return String.format("%s %s", message, name);
    }

}
