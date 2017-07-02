/**
 * Created by aleksandr.kot on 7/2/17.
 */
public class User {
    private int randomNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobileNumber;
    private String altEmail;
    private String altPhoneNumber;
    private String address;
    private String city;

    public User(int randomNumber, String firstName, String lastName, String email, String password, String mobileNumber, String altEmail, String altPhoneNumber, String address, String city) {
        this.randomNumber = randomNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.altEmail = altEmail;
        this.altPhoneNumber = altPhoneNumber;
        this.address = address;
        this.city = city;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String getAltPhoneNumber() {
        return altPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public void setAltPhoneNumber(String altPhoneNumber) {
        this.altPhoneNumber = altPhoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
