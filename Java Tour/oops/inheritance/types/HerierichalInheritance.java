package oops.inheritance.types;

public class HerierichalInheritance {
    public static void main(String[] args) {
        DeveloperOne developerOne = new DeveloperOne();
        developerOne.setProjectName("Sarvagram");
        developerOne.getProjectDetails("Ranveer");
        Developertwo developertwo = new Developertwo();
        developertwo.setProjectName("sarvagram");
        developertwo.getProjectDetails("ANil");
    }
}

class Project {
    String projectName;
    String projectDuration;

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDuration() {
        return projectDuration;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectDuration(String projectDuration) {
        this.projectDuration = projectDuration;
    }

    void getProjectDetails(String name) {
        System.out.println(name + " is workinng on " + projectName);
    }

}

class DeveloperOne extends Project {

}

class Developertwo extends Project {

}
