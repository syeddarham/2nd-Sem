package huzaifaalab3;

import java.util.ArrayList;
import java.util.List;

class Company {
    String companyName;
    String industryType;
    String jobRole;
    List<String> requireSkills;
    List<String> interviewStudents;

    Company(String comname, String industyee, String jobbing, List<String> skillll) {
        companyName = comname;
        industryType = industyee;
        jobRole = jobbing;
        requireSkills = skillll;
        interviewStudents = new ArrayList<>();
    }

    void scheduleInterview(Student stu) {
        if (stu.skills.containsAll(requireSkills)) {
            interviewStudents.add(stu.name);
        } else {
            System.out.println("Eligibility not matched " + stu.name);
        }
    }

    void printDetails() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Industry Type : " + industryType);
        System.out.println("Job Role : " + jobRole);
        System.out.println("Require Skills : " + requireSkills);
        System.out.println("Interview Students : " + interviewStudents);
        System.out.println();
    }
}
