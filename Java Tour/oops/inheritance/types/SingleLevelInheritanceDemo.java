package oops.inheritance.types;

class SingleLevelInheritanceDemo {
    public static void main(String[] args) {
        Developers developer = new Developers();
        developer.setName("Santosh");
        developer.working();
        developer.setName("Amit");
        developer.workings();
    }
}

class Person {
    String name;
    String designation;

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    void workings() {
        System.out.println(name + " manager of this project");
    }
}

class LeadDevelopers extends Persons {
    void working() {
        System.out.println(name + " Lead on dev project");
    }
}

