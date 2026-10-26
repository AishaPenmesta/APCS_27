/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
int random = (int)(Math.random()*3);
if(random==0){
    return "rock";
    
}
else if(random ==1){
return "paper";
}
else{
    return "scissors";
}
    }
public static int compare2(String player1, String player2){
    if(player1.equals(player2)){
        return 0;
    }
    if((player1.equals("rock")&& player2.equals("scissors"))||(player1.equals("scissors")&& player2.equals("paper"))||(player1.equals("paper")&&player2.equals("rock"))){
        return 1;
    }

    if((player2.equals("rock")&& player1.equals("scissors"))||(player2.equals("scissors")&& player1.equals("paper"))||(player2.equals("paper")&&player1.equals("rock"))){
        return 2;
    }
    return 3;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer =("");
         String answer2 = (" ");
        while(!answer.equals("done")){
        System.out.println("Would you like to play the computer? (yes/no/done) ");
        answer = sc.nextLine();
        if(answer.equals("yes")){
            System.out.println();
            System.out.println("-----------------------------------");
        while (!answer2.equals("rock")&&!answer2.equals("paper")&&!answer2.equals("scissors")){
             System.out.println("Please enter rock/paper/scissors: ");
            answer2 = sc.nextLine();
                if(!answer2.equals("rock")||!answer2.equals("paper")||!answer2.equals("scissors")){
                    System.out.println("Invalid answer, try again.");
                }
            }
            String computer = getObject();
            System.out.println("You chose: "+ answer2);
            System.out.println("The computer chose: "+ computer);
            int result = compare2(answer2,computer);
            if(result==0){
                System.out.println("It's a tie!");
    
            }
            else if(result==1){
                System.out.println("You won!");
            }
            else if(result ==2){
                System.out.println("The computer won! You lost.");
            }
System.out.println("-----------------------------------");
        }
        else if (answer.equals("no")){
            System.out.println("How many times would you like the computer to play itself?");
            int gameNumber = sc.nextInt();
            sc.nextLine();
            int player1win = 0;
            int player2win = 0;
            int playerTies = 0;
            int count = 0;
            while(count<gameNumber){
                String player1 = getObject();
                String player2 = getObject();
                int finalTallies = compare2(player1, player2);
                if(finalTallies==1){
                    player1win =player1win+1;
                }
                else if(finalTallies==0){
                    playerTies=playerTies+1;
                }
                else if(finalTallies==2){
                    player2win = player2win+1;
                }
            count = count+1;
            }
            System.out.println("Player 1 wins: "+player1win);
            System.out.println("Player 2 wins: "+player2win);
             System.out.println("Ties: "+playerTies);
             System.out.println("-----------------------------------");
        }
        else if(answer.equals("done")){
            System.out.println("Thanks for playing!");
        }
        else{
            System.out.println("Invalid answer. Type yes/no/done!");
        }
        }


    }
}
