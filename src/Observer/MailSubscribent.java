package Observer;

public class MailSubscribent implements Observer{

    private String name;

    public MailSubscribent(String name) {
        this.name = name;
    }

    @Override
    public void update(String topicName) {
        System.out.println("Hi " + name + ", there is a new e-mail called " + topicName);
    }
}
