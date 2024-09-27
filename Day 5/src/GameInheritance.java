import java.util.Scanner;
class Game{
    //String Pname;
    public String name;
    public int MaxnumPlayers;
    public String  toString(){
        return "enter the game name:" + name+"enter num of players:"+MaxnumPlayers;

    }


}
class GameWithTimeLimit extends Game{
    public  int TimeLimit;
    public String toString(){
        return super.toString()+"TimeLimit"+TimeLimit;

    }
}




public class GameInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//GameWithTimeLimit gtw = new GameWithTimeLimit();
        System.out.println("Enter the name of the game : ");
        String name = sc.nextLine();
        System.out.println("Enter the max number of players : ");
        int MaxnumPlayers = sc.nextInt();
        System.out.println("Enter the time limit : ");
        int TimeLimit = sc.nextInt();
        GameWithTimeLimit gtw = new GameWithTimeLimit();
    }
}
