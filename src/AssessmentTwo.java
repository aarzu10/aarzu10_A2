public class AssessmentTwo {
    public static void main(String[] args) {
        AssessmentTwo at = new AssessmentTwo();
        at.partThree();
        at.partFourA();
        at.partFourB();
        at.partFive();
        at.partSix();
        at.partSeven();
    }

    private void partSeven() {
    }

    private void partSix() {
    }

    private void partFive() {
    }

    public void partThree() {
        System.out.println("Running partThree...");
        Employee rideOperator = new Employee("John Doe", 30, "123 Park Lane", "E001", "Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill Ride", rideOperator);

        Visitor v1 = new Visitor("Alice", 25, "456 Elm St", "V001", "Day Pass");
        Visitor v2 = new Visitor("Bob", 28, "789 Pine St", "V002", "Day Pass");
        // Visitor v3 = new Visitor("Charlie", 22, "321 Oak St", "V003", "Day Pass");
        Visitor v4 = new Visitor("Diana", 27, "654 Maple St", "V004", "Day Pass");
        Visitor v5 = new Visitor("Ethan", 26, "987 Birch St", "V005", "Day Pass");

        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
        //rollerCoaster.addVisitorToQueue(v3);
        rollerCoaster.addVisitorToQueue(v4);
        rollerCoaster.addVisitorToQueue(v5);

        rollerCoaster.printQueue();
        rollerCoaster.removeVisitorFromQueue(v2);
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        System.out.println("Running partFourA...");
        Employee rideOperator = new Employee("John Doe", 30, "123 Park Lane", "E001", "Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill Ride", rideOperator);

        Visitor v1 = new Visitor("Alice", 25, "456 Elm St", "V001", "Day Pass");
        Visitor v2 = new Visitor("Bob", 28, "789 Pine St", "V002", "Day Pass");
        // Visitor v3 = new Visitor("Charlie", 22, "321 Oak St", "V003", "Day Pass");
        Visitor v4 = new Visitor("Diana", 27, "654 Maple St", "V004", "Day Pass");
        Visitor v5 = new Visitor("Ethan", 26, "987 Birch St", "V005", "Day Pass");

        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
        //rollerCoaster.addVisitorToQueue(v3);
        rollerCoaster.addVisitorToQueue(v4);
        rollerCoaster.addVisitorToQueue(v5);

        rollerCoaster.runOneCycle();
        rollerCoaster.printRideHistory();
    }

    public void partFourB() {
        System.out.println("Running partFourB...");
        Employee rideOperator = new Employee("John Doe", 30, "123 Park Lane", "E001", "Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill Ride", rideOperator);

        Visitor v1 = new Visitor("Alice", 25, "456 Elm St", "V001", "Day Pass");
        Visitor v2 = new Visitor("Bob", 28, "789 Pine St", "V002", "Day Pass");
        //Visitor v3 = new Visitor("Charlie", 22, "321 Oak St", "V003", "Day Pass");
        Visitor v4 = new Visitor("Diana", 27, "654 Maple St", "V004", "Day Pass");
        Visitor v5 = new Visitor("Ethan", 26, "987 Birch St", "V005", "Day Pass");

        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
    }
}