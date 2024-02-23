package service;

import model.SubjectDTO;

public interface GradeService {
    public int getTotal(SubjectDTO subjects);

    public double getAverage(SubjectDTO subjects);

}
