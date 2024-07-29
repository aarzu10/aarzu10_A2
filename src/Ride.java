import java.util.Queue;
import java.util.LinkedList;

public class Ride {
    private String rideName;
    private String rideType;
    private Employee rideOperator;
    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    public Ride() {
    }

    public Ride(String rideName, String rideType, Employee rideOperator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    public Queue<Visitor> getWaitingLine() {
        return waitingLine;
    }

    public void setWaitingLine(Queue<Visitor> waitingLine) {
        this.waitingLine = waitingLine;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    public void setRideHistory(LinkedList<Visitor> rideHistory) {
        this.rideHistory = rideHistory;
    }

    public void addVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
        System.out.println(visitor.getName() + " added to the queue.");
    }

    public void removeVisitorFromQueue(Visitor visitor) {
        if (waitingLine.remove(visitor)) {
            System.out.println(visitor.getName() + " removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " is not in the queue.");
        }
    }

    public void printQueue() {
        System.out.println("Visitors in the queue:");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName());
        }
    }

    public void runOneCycle() {
        int maxRiders = 2; // Example: max 2 visitors per cycle
        int count = 0;
        while (!waitingLine.isEmpty() && count < maxRiders) {
            Visitor visitor = waitingLine.poll();
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " is taking the ride.");
            count++;
        }
    }

    public void printRideHistory() {
        System.out.println("Visitors who took the ride:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }
}
