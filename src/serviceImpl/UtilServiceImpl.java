package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance=new UtilServiceImpl();

    private UtilServiceImpl(){};

    public static UtilService getInstance(){
        return instance;
    }

    @Override
    public int createRandomInteger(int start, int gapBetweenStartAndEnd) {
        //0이상 50 미만의 값을 생성하고 150을 더해줌으로써 키의 범위를 150이상 200미만으로 만듬
        return start+(int)(Math.random()*gapBetweenStartAndEnd);
    }

    @Override
    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        return Math.round(((start + Math.random() * gapBetweenStartAndEnd) * 10) / 10);
    }

}
