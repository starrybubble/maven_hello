import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by starrybubble on 2018/9/16.
 * version 1.1
 */

@Setter
@Getter
@Builder
public class User {

    private String id;
    private String name;
    private Integer age;


    public static void main(String[] args) {
        User user = User.builder().id("1").name("builder").age(1).build();
        System.out.println(user.getId());
        System.out.println(user.getName());
        user.setId("2");
        user.setName("revise");
        System.out.println(user.getId());
        System.out.println(user.getName());
    }
}
