public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    // Default constructor
    public Visitor() {
        super();
    }

    // Parameterized constructor
    public Visitor(String name, int age, String address, String visitorId, String ticketType) {
        super(name, age, address);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getter for visitorId
    public String getVisitorId() {
        return visitorId;
    }

    // Setter for visitorId
    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    // Getter for ticketType
    public String getTicketType() {
        return ticketType;
    }

    // Setter for ticketType
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
