import view.BoardView;
import view.JoinView;
import view.KaupView;
import view.SubjectView;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("0-종료 1-회원가입 2-성적표 3-게시판 4-카우프");

            String control=sc.next();

            switch (control){
                case "0": return;
                case "1": JoinView.main(sc);break;
                case "2": SubjectView.main();break;
                case "3": BoardView.main();break;
                case "4": KaupView.main(sc);break;
            }
        }
    }
}