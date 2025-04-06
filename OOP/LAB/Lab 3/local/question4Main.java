package huzaifaalab3;

public class question4Main {
    public static void main(String[] args) {

        Course programFunda = new Course();
        programFunda.setCourseCode("ES1002");
        programFunda.setCourseName("Programming Fundamental");
        programFunda.setCreditHour(3);

        Course functionalEnglish = new Course();
        functionalEnglish.setCourseCode("PST1004");
        functionalEnglish.setCourseName("Functional English");
        functionalEnglish.setCreditHour(2);

        programFunda.displayDetails();
        functionalEnglish.displayDetails();
    }
}
