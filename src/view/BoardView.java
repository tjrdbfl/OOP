package view;

import model.Board;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main() {
        List<Board> articles=new ArrayList<Board>();
        UtilService util= UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            articles.add(Board.builder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRamdomName())
                    .build());
        }

        //stream 요소 처리(람다식의 일종) - 속도 fast
        articles.forEach(i -> {
            System.out.println(i.toString());
        });
        //고용량에서 유리: articles에서 하나를 뽑아서 처리
        for(Board i: articles){
            System.out.println(i.toString());
        }
//        for(int i=0;i<articles.size();i++){
//            System.out.println(articles.get(i).toString());
//        }


    }
}
