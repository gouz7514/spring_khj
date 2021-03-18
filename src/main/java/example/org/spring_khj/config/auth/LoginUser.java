package example.org.spring_khj.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) // 이 어노테이션이 생성될 수 있는 위치를 지정. PARAMETER로 지정했으니 메소드의 파라미터로 선언된 객체에서만 사용 가능
@Retention(RetentionPolicy.RUNTIME) // 자바 컴파일러가 어노테이션을 다루는 방법. RUNTIME : 컴파일 이후에도 JVM에 의해 계속 참조 가능
public @interface LoginUser { // 이 파일을 어노테이션 클래스로 지정
}
