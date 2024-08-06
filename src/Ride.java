import java.util.*;

public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee rideOperator;
    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;
    private int maxRiders;
    private int numOfCycles;

    public Ride() {
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRiders = 2; // Default value for max riders per cycle
        this.numOfCycles = 0; // Initial number of cycles
    }

    public Ride(String rideName, String rideType, Employee rideOperator) {
        this();
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
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

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
        System.out.println(visitor.getName() + " added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (waitingLine.remove(visitor)) {
            System.out.println(visitor.getName() + " removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the queue:");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        if (rideOperator == null) {
            System.out.println("No ride operator assigned. Cannot run the ride.");
            return;
        }

        int count = 0;
        while (!waitingLine.isEmpty() && count < maxRiders) {
            Visitor visitor = waitingLine.poll();
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " is taking the ride.");
            count++;
        }
        numOfCycles++;
    }

    @Override
    public void printRideHistory() {
        System.out.println("Visitors who took the ride:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }
}
