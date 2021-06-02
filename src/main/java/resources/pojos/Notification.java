package resources.pojos;

/**
 * Creating Notification Pojo Notification with Getters and Setters
 */

public class Notification {

    private String text;

    public Notification(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
