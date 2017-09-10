package es.joanmiralles.spring.helloworldspring.bean;

public class Greeting {
    private final String player;
    private final String message;

    public Greeting(String player, String message) {
        this.player = player;
        this.message = message;
    }

    public String getPlayer() {
        return player;
    }

    public String getMessage() {
        return message;
    }
}
