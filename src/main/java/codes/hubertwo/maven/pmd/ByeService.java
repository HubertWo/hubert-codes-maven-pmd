package codes.hubertwo.maven.pmd;

public class ByeService {

    public String bye(String name) {
        return buildMessage("Bye", name);
    }

    /**
     * This method is identical to {@link HelloService#buildMessage(String, String)}.
     */
    private String buildMessage(String name, String message) {
        return String.format("%s %s", message, name);
    }

}
