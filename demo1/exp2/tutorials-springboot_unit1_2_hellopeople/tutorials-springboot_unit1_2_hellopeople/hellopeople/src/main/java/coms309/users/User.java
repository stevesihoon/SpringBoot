package coms309.users;


/**
 * Provides the Definition/Structure for the people row
 *
 * @author Sihoon Lee
 */

public class User {

    private String id;

    private String password;

    private String address;

    private String telephone;

    public User(){

    }

    public User(String id, String password, String address, String telephone){
        this.id = id;
        this.password = password;
        this.address = address;
        this.telephone = telephone;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return id + " "
                + password + " "
                + address + " "
                + telephone;
    }
}
