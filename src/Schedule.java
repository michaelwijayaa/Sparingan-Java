import java.util.Date;

public class Schedule {
    private int id;


    private Sport sport;
    private Location location;
    private Date date;
    private Users user1;
    private Users user2;

    //Constructor Schedule, pertama-tama cuma masukin user yang bikin, nanti pas matching kalo match ya masukin user2
    public Schedule(Sport sport, Date date,Location location, Users user1) {
        this.sport = sport;
        this.location = location;
        this.date = date;
        this.user1 = user1;
        id = DatabaseSchedule.getLastScheduleId() + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Users getUser1() {
        return user1;
    }

    public void setUser1(Users user1) {
        this.user1 = user1;
    }

    public Users getUser2() {
        return user2;
    }

    public void setUser2(Users user2) {
        this.user2 = user2;
    }
}
