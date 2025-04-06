package huzaifaalab3;


public class question2Main {
    public static void main(String[] args) {
        Session aisession = new Session("AI in Modern Application", 3);
        Session cyberSession = new Session("CyberSecurity Trends", 5);

        aisession.scheduleSession("M.Huzaifa", "E35");
        cyberSession.scheduleSession("Shaiza Altaf","D18");


        aisession.printDetails();
        cyberSession.printDetails();

    }
}

