package huzaifaalab3;
import java.util.*;


public class question3Main {
    
    public static void main(String[] args) {
        Company systemLimit = new Company("System Limited", "Software Development", "Software Engineer", List.of("java", "python", "SQL"));
        Company foliox = new Company("Folio PrivateLimited", "Data Science", "Data Analytics", List.of("js", "appmanagement", "mongodb"));

        Student s1 = new Student("Huzaifa", List.of("js", "appmanagement", "mongodb"));
        Student s2 = new Student("Ali", List.of("firebase", "supabase"));

        foliox.scheduleInterview(s1);
        systemLimit.scheduleInterview(s2);

        systemLimit.printDetails();
        foliox.printDetails();
    }
}

