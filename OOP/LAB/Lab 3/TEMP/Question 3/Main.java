class Student {
    String name;
    String[] skills;

    Student(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }
}

class Company {
    String companyName;
    String industryType;
    String jobRole;
    String[] requiredSkills;

    Company(String companyName, String industryType, String jobRole, String[] requiredSkills) {
        this.companyName = companyName;
        this.industryType = industryType;
        this.jobRole = jobRole;
        this.requiredSkills = requiredSkills;
    }

    void scheduleInterview(Student student) {
        for (String skill : requiredSkills) {
            boolean hasSkill = false;
            for (String studentSkill : student.skills) {
                if (skill.equals(studentSkill)) {
                    hasSkill = true;
                    break;
                }
            }
            if (!hasSkill) {
                System.out.println(student.name + " does not meet the requirements for " + companyName);
                return;
            }
        }
        System.out.println(student.name + " has been scheduled for an interview with " + companyName);
    }

    void displayCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Industry Type: " + industryType);
        System.out.println("Job Role: " + jobRole);
        System.out.print("Required Skills: ");
        for (String skill : requiredSkills) {
            System.out.print(skill + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Company systemsLimited = new Company("Systems Limited", "IT", "Software Engineer", new String[]{"Java", "Python", "SQL"});
        Company folio3 = new Company("Folio3", "IT", "Data Analyst", new String[]{"Machine Learning", "Python", "Power BI"});

        Student student1 = new Student("Ali", new String[]{"Java", "Python", "SQL"});
        Student student2 = new Student("Ahmed", new String[]{"Machine Learning", "Python", "Power BI"});

        systemsLimited.displayCompanyDetails();
        folio3.displayCompanyDetails();

        systemsLimited.scheduleInterview(student1);
        folio3.scheduleInterview(student2);
    }
}