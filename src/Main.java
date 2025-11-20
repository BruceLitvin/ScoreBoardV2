import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
   /* String info;
        ScoreBoard game=new ScoreBoard("Red", "Blue");
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info=game.getScore();
        System.out.println(info);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(3);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        game.recordPlay(0);
        info=game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        info=game.getScore();
        System.out.println(info);

        ScoreBoard match = new ScoreBoard("Lions", "Tigers");
        info=match.getScore();
        System.out.println(info);

        info=game.getScore();
        System.out.println(info); */

    }
    public static void read() throws FileNotFoundException {
        int Rwins=0;
        int Owins=0;
        int Ywins=0;
        int Gwins=0;
        int Bwins=0;
        int Iwins=0;
        int Vwins=0;
        File f = new File("ScoreBoard.txt");//document
        Scanner s = new Scanner(f);//scan the document

        while (s.hasNext())
        {
           ScoreBoard forever= new ScoreBoard(" "," ");
            while(s.hasNextInt())
            {

            }

        }
    }
}