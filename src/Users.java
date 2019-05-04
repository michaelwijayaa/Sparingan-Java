
public class Users {

    //Rating bikin class baru aja kali ya
    //Location mungkin bisa pake free map api ngambil JSON nya
    //Favourite Sport pake Enum juga bisa (bikin enum sport)
    private String name, location, phoneNumber, password,email;
    private int id;
    private Sport sport;

    public Users(String name, String location, String phoneNumber, String password, String email, Sport sport) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
        this.sport = sport;
        id = DatabaseUser.getLastUserId() + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
