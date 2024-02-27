package serviceImpl;

import service.UtilService;

import java.util.List;

public class UtilServiceImpl implements UtilService {

    private static UtilService instance=new UtilServiceImpl();

    private UtilServiceImpl(){};

    public static UtilService getInstance(){
        return instance;
    }

    @Override
    public int createRandomInteger(int start, int gapBetweenStartAndEnd) {
        return start+(int)(Math.random()*gapBetweenStartAndEnd);
    }

    @Override
    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        return Math.round(((start + Math.random() * gapBetweenStartAndEnd) * 10) / 10);
    }

    @Override
    public String createRamdomName() {
        String[] names={"이정재", "마동석", "송강호", "윤여정", "황정민"
                , "정우성", "이병헌", "현 빈", "유해진", "손석구"
                , "전도연", "손예진", "하지원", "김하늘", "송중기"
                , "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜수"};

        return names[createRandomInteger(0,20)];
    }

    @Override
    public String createRandomTitle() {
        String[] titles={"DSF(DSD Storage Facility)"
                , "국가가 변호인을 붙인다."
                , "영전을 수여한다."
                , "권리를 가진다."
                , "법률로 정한다."
                , "요구가 있으면 회기중 석방된다."
                , "대통령으로 당선될 수 없다. "
                , "대통령이 임명한다."
                , "운송 서비스이다."
                , "우리나라까지 분포된다. "
               };

        return titles[createRandomInteger(0,10)];
    }

    @Override
    public String createRandomContent() {
        String[] contents={"DSF(DSD Storage Facility) 파일은 메타 데이터가 포함되어 있는 파일입니다."
                , "다만, 형사피고인이 스스로 변호인을 구할 수 없을 때에는 법률이 정하는 바에 의하여 국가가 변호인을 붙인다."
                , "대통령은 법률이 정하는 바에 의하여 훈장 기타의 영전을 수여한다."
                , "누구든지 체포 또는 구속을 당한 때에는 즉시 변호인의 조력을 받을 권리를 가진다."
                , "국회의원의 선거구와 비례대표제 기타 선거에 관한 사항은 법률로 정한다."
                , "국회의원이 회기전에 체포 또는 구금된 때에는 현행범인이 아닌 한 국회의 요구가 있으면 회기중 석방된다."
                , "대통령후보자가 1인일 때에는 그 득표수가 선거권자 총수의 3분의 1 이상이 아니면 대통령으로 당선될 수 없다. "
                , "행정각부의 장은 국무위원 중에서 국무총리의 제청으로 대통령이 임명한다."
                , "체계적이고 세분화된 프로세스, 스마트 물류 서비스, 수출입 운송 서비스이다."
                , "사과나무의 원산지는 중앙아시아로 알려져 있으며 이 원생종은 동쪽으로 중국서부와 시베리아를 거쳐 우리나라까지 분포된다. "
        };

        return contents[createRandomInteger(0,10)];
    }

    @Override
    public String createRandomCompany() {
        String[] companies={"구글","애플","삼성","LG","엔비디아"
                ,"메타", "현대","기아","테슬라","아마존"};
        return companies[createRandomInteger(0,10)];
    }

    @Override
    public String createRandomUsername() {
        String username = "";
        for(; username.length() < 5; username += String.valueOf((char)('a' + this.createRandomInteger(0, 26))));
        return username;
    }

}
