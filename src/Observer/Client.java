package Observer;

public class Client {
    public static void main(String[] args) {
        Mail mail = new Mail("New IDE update v 0.1.2");
        MailSubscribent mailSubscribent = new MailSubscribent("Kamil");
        MailSubscribent mailSubscribent2 = new MailSubscribent("Dawid");
        mail.register(mailSubscribent);
        mail.register(mailSubscribent2);
        mail.notifyObservers();
        mail.unregister(mailSubscribent);
        mail.notifyObservers();
    }
}
