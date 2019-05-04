import java.util.ArrayList;

public class DatabaseUser {
    private static ArrayList<Schedule> USER_DATABASE = new ArrayList<>();
    private static int LAST_USER_ID = 1;

    public static ArrayList<Schedule> getUserDatabase() {
        return USER_DATABASE;
    }

    public static int getLastUserId() {
        return LAST_USER_ID;
    }

    public static boolean addUser(Schedule user) {
        USER_DATABASE.add(user);
        LAST_USER_ID = user.getId();
        return true;
    }
    public static Schedule getUser(int id) throws UserNotFoundException{
        for(Schedule user : USER_DATABASE){
            if(user.getId() == id){
                return user;
            }
        }
        throw new UserNotFoundException(id);
    }
    public static boolean removeUser (int id) throws UserNotFoundException{
        for (Schedule user : USER_DATABASE){
            if(user.getId() == id){
                USER_DATABASE.remove(user);
                return true;
            }
        }
        throw new UserNotFoundException(id);
    }
}
