package view;

import builder.SubjectBuilder;
import model.SubjectDTO;
import model.User;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class SubjectView {
    public static void main() {

        System.out.printf("다음은 한 학생의 과목 점수이다.\n" +
                "이름: ");

        Scanner sc = new Scanner(System.in);

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();

        User student = User.builder()
                .name(sc.next())
                .build();

        SubjectDTO subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0, 100))
                .math(util.createRandomInteger(0, 100))
                .english(util.createRandomInteger(0, 100))
                .build();

        int totalGrade = grade.getTotal(subjects);
        double average = grade.getAverage(subjects);

        System.out.printf("================= 성적표 =================\n" +
                        "Korean: %s\n" +
                        "Math: %s\n" +
                        "English: %s\n" +
                        "Total: %s\n" +
                        "Average: %.2f\n" +
                        "================= 성적표 ================="
                , subjects.getKorean()
                , subjects.getMath()
                , subjects.getEnglish()
                , totalGrade
                , average);

    }
}
