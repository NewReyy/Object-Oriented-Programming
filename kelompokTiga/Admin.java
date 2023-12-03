package kelompokTiga;

/**
 *
 * @author Nuri, Kukuh, Siti
 */
public class Admin {
    protected String username;
    protected String password;

    public Admin (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    
}
