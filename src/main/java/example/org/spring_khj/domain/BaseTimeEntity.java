package example.org.spring_khj.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

// 모든 Entity의 상위 클래스가 되어
// Entity들의 createdDate, modifiedDate를 자동으로 관리하는 역할

@Getter
@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity 상속 시 필드들도 칼럼으로 인식하도록
@EntityListeners(AuditingEntityListener.class) // BaseTimeEntity 클래스에 Auditing 기능 포함시킴
public class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createdDate; // Entity 생성되어 저장될 때 시간 자동 저장

    @LastModifiedDate
    private LocalDateTime modifiedDate; // 조회한 Entity 값 변경 시 시간 자동 저장
}
