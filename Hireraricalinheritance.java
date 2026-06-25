class Staff {
    int code;
    String name;

    void getStaffData(int c, String n) {
        code = c;
        name = n;
    }

    void displayStaffData() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    String subject;
    String publication;

    void getTeacherData(int c, String n, String s, String p) {
        getStaffData(c, n);
        subject = s;
        publication = p;
    }

    void displayTeacherData() {
        displayStaffData();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class OfficeStaff extends Staff {
    String grade;

    void getOfficeStaffData(int c, String n, String g) {
        getStaffData(c, n);
        grade = g;
    }

    void displayOfficeStaffData() {
        displayStaffData();
        System.out.println("Grade: " + grade);
    }
}

class InstituteDatabase {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.getTeacherData(101, "Rahul", "Maths", "Pearson");

        Teacher t2 = new Teacher();
        t2.getTeacherData(102, "Anita", "Physics", "Oxford");

        OfficeStaff o1 = new OfficeStaff();
        o1.getOfficeStaffData(201, "Suresh", "A");

        OfficeStaff o2 = new OfficeStaff();
        o2.getOfficeStaffData(202, "Meena", "B");

        System.out.println("\n--- Teacher 1 ---");
        t1.displayTeacherData();

        System.out.println("\n--- Teacher 2 ---");
        t2.displayTeacherData();

        System.out.println("\n--- Office Staff 1 ---");
        o1.displayOfficeStaffData();

        System.out.println("\n--- Office Staff 2 ---");
        o2.displayOfficeStaffData();
    }
}
