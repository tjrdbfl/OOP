package view;

import builder.BoardBuilder;
import model.BoardDTO;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main() {
        List<BoardDTO> articles=new ArrayList<BoardDTO>();
        UtilService util= UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            articles.add(new BoardBuilder()
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
        for(BoardDTO i: articles){
            System.out.println(i.toString());
        }
//        for(int i=0;i<articles.size();i++){
//            System.out.println(articles.get(i).toString());
//        }


    }
}
