package main.java.builder;

import java.util.Date;

public class User {
    private Integer id; //required
    private String firstName; //required
    private String lastName; //optional
    private String phone; //optional

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(UserBuilder builder) {
        this.id = id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
    }

    public static class UserBuilder {

        private final Integer id; //final  - only for required
        private final String firstName;  //final  - only for required
        private String lastName; //optional
        private String phone; //optional

        public UserBuilder(Integer id, String firstName) {
            this.id = id;
            this.firstName = firstName;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
