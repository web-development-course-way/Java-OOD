import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        User user = BuilderPattern.of(User::new)
                .with(User::setFirstName, "John")
                .with(User::setSecondName, "Doeeee")
                .with(User::setLastName, "Doe")
                .with(User::setAge, 30)
                .with(User::setEmail, "john.doe@example.com")
                .build();

        System.out.println(user);
    }
}
