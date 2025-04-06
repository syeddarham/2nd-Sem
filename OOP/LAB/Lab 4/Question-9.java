import java.util.*;

class Project {
    String projectName;
    String deadLine;
    double budget;

    Project() {
        projectName = "Untitled";
        deadLine = "Not Assigned";
        budget = 0.0;
        System.out.println("Project Created : " + projectName + " , DeadLine : " + deadLine + " , Budget : " + budget);
    }

    Project(String projectName, String deadLine) {
        this.projectName = projectName;
        this.deadLine = deadLine;
        System.out.println("Project Created : " + projectName + " , DeadLine : " + deadLine);
    }

    Project(String projectName, String deadLine, double budget) {
        this.projectName = projectName;
        this.deadLine = deadLine;
        this.budget = budget;
        System.out.println("Project Created : " + projectName + " , DeadLine : " + deadLine + " , Budget : " + budget);
    }

    @Override
    protected void finalize() {
        System.out.println("Project Deleted : " + projectName + " is being garbage collected ");
    }
}

class ProjectAI extends Project {

    ProjectAI(String projectName, String deadLine, double budget) {
        super(projectName, deadLine, budget);
    }

    ProjectAI(String projectName, String deadLine) {
        super(projectName, deadLine);
    }

    ProjectAI() {
        super();
    }
}

public class Q9 {
    public static void main(String[] args) {

        Project Project1 = new Project();
        Project Project2 = new Project("Food Panda", "30th June 2025");
        Project Project3 = new Project("Education App", "31th Dec 2025", 50000);
        ProjectAI Project4 = new ProjectAI("AI Robot", "20th Feb 2025");
        ProjectAI Project5 = new ProjectAI("AI Based Fraud Detection", "2 March 2026", 245000);
        ProjectAI Project6 = new ProjectAI("AI Chatbot", "23rd September 2026", 245000);

        Project1 = null;
        Project2 = null;
        Project3 = null;
        Project4 = null;
        Project5 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

