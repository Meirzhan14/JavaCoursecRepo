package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Stan", "Lee");
        email1.setMailBoxCapacity(150);
        email1.setAlternateEmail("meir.com");
        System.out.println(email1.getAlternateEmail());
        System.out.println(email1.showInfo());
    }
}
