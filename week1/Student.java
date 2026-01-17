public class Student {
        String name;
        int rollNo;

        Student(String name, int rollNo) {
            this.name = name;
           this. rollNo = rollNo;
        }

        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
        }
    }

