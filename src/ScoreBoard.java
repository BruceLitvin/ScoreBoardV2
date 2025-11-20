public class ScoreBoard {
    private  String word;
    private String word2;
    private int scoreTeam1 =0;
    private int scoreTeam2=0;
    private boolean isActive=true;
    String info;

    public ScoreBoard(String team1, String team2){
        word=team1;
        word2=team2;

    }

    public void recordPlay(int num){

        if(num==0){
            isActive=!isActive;
        }
        if(isActive==true) {
            scoreTeam1+=num;
        }
        if(isActive==false){
            scoreTeam2+=num;
        }
        System.out.println(scoreTeam1);
        System.out.println(scoreTeam2);




    }
    public String getScore(){
        String activeTeam=null;
        if(isActive==true){
            activeTeam=word;
        }
        if(isActive==false){
            activeTeam=word2;
        }
         return (scoreTeam1+"-"+scoreTeam2+activeTeam);

        }



}



