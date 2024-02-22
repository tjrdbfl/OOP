package serviceImpl;

import service.GradeService;

public class GradeServiceImpl implements GradeService {

    @Override
    public int getTotal(int korean, int math, int english) {
        int total=0;
        total=korean+math+english;
        return total;
    }

    @Override
    public double getAverage(int korean, int math, int english) {
        double avaerage=0;
        avaerage=(double)(korean+math+ english)/3;
        return avaerage;
    }
}
