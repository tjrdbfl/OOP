package model;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString

public class SubjectDTO {
    private int korean;
    private int math;
    private int english;

    @Builder(builderMethodName = "builder")
    public SubjectDTO(int korean, int math, int english){
        this.korean=korean;
        this.math=math;
        this.english=english;
    }


}
