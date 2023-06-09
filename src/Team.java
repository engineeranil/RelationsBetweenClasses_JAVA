public class Team {
   private String name;
   private String yildiz;


    public Team(String name,String yildiz){
        this.name = name;
        this.yildiz=yildiz;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getYildiz(){
        return yildiz;
    }
    public void setYildiz(String yildiz){
        this.yildiz=yildiz;
    }


   public double calcGoal(Player[] players){
        double total = 0;
        for(int i = 0; i<players.length; i++){
            total+=players[i].getGoalNumber();
        }
        return total/ players.length;
   }


}
