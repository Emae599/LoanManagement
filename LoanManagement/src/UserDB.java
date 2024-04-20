import java.util.HashMap;

public class UserDB {
	public static HashMap<String, String> userDB = new HashMap<>();
	public static  boolean addUser1(String number, String password){userDB.put(number, password);
	return false;}
	public static  void addUser2(String email, String password) {userDB.put(email, password);}
}