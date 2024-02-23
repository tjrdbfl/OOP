package view;

import builder.SubjectBuilder;
import model.SubjectDTO;
import service.GradeService;
import serviceImpl.GradeServiceImpl;

import java.util.Scanner;

public class SubjectView {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("다음은 한 학생의 과목 점수이다.");

        System.out.println("국어점수, 수학점수, 영어점수, 이름");

        SubjectDTO subjectBuilder=new SubjectBuilder()
                .korean(sc.nextInt())
                .math(sc.nextInt())
                .english(sc.nextInt())
                .name(sc.next())
                .build();

        GradeService gradeService=GradeServiceImpl.getInstance();

        System.out.println(subjectBuilder.toString());

        System.out.println("평균 점수: "+gradeService.getTotal( subjectBuilder.getKorean(), subjectBuilder.getMath(),subjectBuilder.getEnglish()));
        System.out.println("평균 점수: "+gradeService.getAverage( subjectBuilder.getKorean(), subjectBuilder.getMath(),subjectBuilder.getEnglish()));

    }
}
