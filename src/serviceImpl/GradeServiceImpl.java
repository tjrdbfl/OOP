package serviceImpl;

import model.SubjectDTO;
import service.GradeService;
import service.KaupService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance=new GradeServiceImpl();

    public GradeServiceImpl(){};

    public static GradeService getInstance(){
        return instance;
    }

    @Override
    public int getTotal(SubjectDTO subjects) {
        int korean=subjects.getKorean();
        int math=subjects.getMath();
        int english=subjects.getEnglish();
        int total=0;

        total=korean+math+english;

        return total;
    }

    @Override
    public double getAverage(SubjectDTO subjects) {
        int korean=subjects.getKorean();
        int math=subjects.getMath();
        int english=subjects.getEnglish();
        double avaerage=0;

        avaerage=(double)(korean+math+ english)/3;

        return avaerage;
    }
}
