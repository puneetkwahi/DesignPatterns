package main.java.builder;

public class TestBuilder {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder(1, "Puneet").build();
        System.out.println(user1);

        User user2 = new User.UserBuilder(2, "Gaurav").setLastName("Vohra")
                .setPhone("989898989").build();

        System.out.println(user2);

    }

}
