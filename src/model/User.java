package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class represents a user in the system.
 * It contains attributes such as id, username, password, first name, and last name.
 */
public class User {
    private int id; // changed from String to int
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private List<HealthRecord> healthRecords;

    /**
     * Constructor for the User class.
     *
     * @param id        the id of the user.
     * @param username  the username of the user.
     * @param password  the password of the user.
     * @param firstName the first name of the user.
     * @param lastName  the last name of the user.
     */
    public User(int id, String username, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.healthRecords = new ArrayList<>();
    }
    
    
    /**
     * Returns the id of the user.
     *
     * @return the id of the user.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id of the user.
     *
     * @param id the new id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the username of the user.
     *
     * @param username the new username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password of the user.
     *
     * @param password the new password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName the new last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the username of the user.
     *
     * @return the username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the password of the user.
     *
     * @return the password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns the first name of the user.
     *
     * @return the first name of the user.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the last name of the user.
     *
     * @return the last name of the user.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns a string representation of the user.
     *
     * @return a string representation of the user.
     */
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /**
     * Checks if this user is equal to the provided object. Users are considered equal if their
     * id, username, password, first name, and last name are all equal.
     *
     * @param o the object to compare to
     * @return true if the users are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    /**
     * Returns a hash code value for this user.
     *
     * @return a hash code value for this user
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName);
    }

    /**
     * Adds a health record to the user's list of health records.
     *
     * @param record the health record to add
     */
    public void addHealthRecord(HealthRecord record) {
        this.healthRecords.add(record);
    }

    /**
     * Returns a list of the user's health records.
     *
     * @return a list of the user's health records
     */
    public List<HealthRecord> getHealthRecords() {
        return this.healthRecords;
    }
}
