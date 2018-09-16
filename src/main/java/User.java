import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by peixin.cpx on 2018/9/16.
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
        user.setId("2");
        System.out.println(user.getId());
    }
}
