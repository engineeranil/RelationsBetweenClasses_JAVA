public class Player {
    private String playerName;
    private String playerSurname;
    private int age;
    private int goalNumber;

    public Player(String playerName, String playerSurname, int age, int goalNumber) {
        this.playerName = playerName;
        this.playerSurname = playerSurname;
        this.age = age;
        this.goalNumber = goalNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGoalNumber() {
        if(0>goalNumber){
            return 0;
        }
        return goalNumber;
    }

    public void setGoalNumber(int goalNumber) {
        this.goalNumber = goalNumber;
    }
}
