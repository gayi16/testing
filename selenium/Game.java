import java.util.Random;
import java.util.Scanner;

public class Game {
     static String win;
    public static String play()
    {
        Scanner sc = new Scanner(System.in);
        String choosed=sc.next();
        return choosed;
    }
    public static String output(String s1,String s2)
    {

        if (s1.equalsIgnoreCase("rock"))
        {
            if(s2.equalsIgnoreCase("paper"))
                win="s2";
            if(s2.equalsIgnoreCase("scissor"))
                win="s1";
            if(s2.equalsIgnoreCase("rock"))
                win="tie";
            else {
                System.out.println("Invalid inputs");
                win="oops";
            }
        }
        if (s1.equalsIgnoreCase("paper"))
        {
            if(s2.equalsIgnoreCase("rock"))
                win="s1";
            if(s2.equalsIgnoreCase("scissor"))
                win= "s2";
            if(s2.equalsIgnoreCase("paper"))
                win= "tie";
            else {
                System.out.println("Invalid inputs");
                win="oops";
            }
        }
        if (s1.equalsIgnoreCase("scissor"))
        {
            if(s2.equalsIgnoreCase("rock"))
                win= "s2";
            if(s2.equalsIgnoreCase("paper"))
                win="s1";
            if(s2.equalsIgnoreCase("scissor"))
                win="tie";
            else {
                win="oops";
            }
        }
//        else {
//            System.out.println("Invalid inputs");
//            win="oops";
//        }

return win;
    }

    public static void game(String player1,String player2) {
        Scanner sc = new Scanner(System.in);


            System.out.println("choose one among rock,paper and scissor");
            Random rand = new Random();
            double no = (Math.random()*1)+1;
            int choice=(int)(Math.ceil(no));

            System.out.println(choice);
            String s1,s2;
            switch (choice)
            {
                case 1:System.out.println("it's your chance "+player1);
                s1=play();
                System.out.println("it's your chance "+player2);
                s2=play();
                String win=output(s1,s2);
                if(win.equalsIgnoreCase("s1"))
                {
                    System.out.println("winner is "+player1);
                }
                else if(win.equalsIgnoreCase("s2"))
                {
                    System.out.println("winner is "+player2);
                }
                else if(win.equalsIgnoreCase("tie"))
                {
                    System.out.println("it's a tie");
                }
                else if(win.equalsIgnoreCase("oops"))
                {
//                    System.out.println("Invalid inputs");
                }
                    System.out.println("do you want to play again? say yes or no");
                break;
                case 2:System.out.println("it's your chance "+player2);
                s1=play();
                System.out.println("it's your chance "+player1);
                s2=play();
                String win1=output(s1,s2);
                    if(win1.equalsIgnoreCase(s1))
                    {
                        System.out.println("winner is"+player2);
                    }
                    else if(win1.equalsIgnoreCase(s2))
                    {
                        System.out.println("winner is "+player1);
                    }
                    else if(win1.equalsIgnoreCase("tie"))
                    {
                        System.out.println("it's a tie");
                    }
                    else if(win1.equalsIgnoreCase("oops"))
                    {
//                        System.out.println("Invalid inputs");
                    }
                    System.out.println("do you want to play again? say yes or no");
                break;
            }



    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name player1 ");
        String player1 = sc.nextLine();
        System.out.println("enter ur name player2 ");
        String player2 = sc.nextLine();
String again;

        do{
            game(player1,player2);
             again= sc.next();
        }
        while(again.equalsIgnoreCase("yes"));



    }
}