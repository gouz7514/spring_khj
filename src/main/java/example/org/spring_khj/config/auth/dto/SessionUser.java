package example.org.spring_khj.config.auth.dto;

import example.org.spring_khj.domain.user.User;
import lombok.Getter;
import java.io.Serializable;

// User 클래스는 엔티티이기 때문에 성능 이슈, 부수 효과를 방지 하기 위해 사용하지 않는다
// 따라서, 직렬화 기능을 가진 세션 Dto를 하나 추가로 만든다. (188p)
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
