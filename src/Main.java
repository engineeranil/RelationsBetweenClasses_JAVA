public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("TUGCE","KELES",23,-10);
        Player p2 = new Player("ANIL","KELES",23,-10);
        Team t1 = new Team("ASIKLAR TAKIMI","*****");
        System.out.println(t1.getName());
        System.out.println(t1.getYildiz());
        Player[] player = {p1,p2};
        System.out.println(t1.calcGoal(player));
        p1.setPlayerName("BARAN");
        System.out.println( p1.getPlayerName());
    }
}
