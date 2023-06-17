import java.util.*;

class RandNumApp{
    public static void gameProcess(int guess_num, int random_num, int guess_count){
        if(guess_num == 15){
                System.out.println();
                System.out.println("CONGRATULATION YOUR GUESS A CORRECT NUMBER!");
                System.out.println("YOU HAVE TRY " + guess_count + " TIMES");
                System.out.println("----------------------------------------------");
                System.out.println();
            }
            else if(guess_num < 15){
                
                System.out.println("THE NUMBER IS BIGGER THAN " + guess_num + " .");
                System.out.println();
            }
            else if(guess_num > 15){
                
                System.out.println("THE NUMBER IS SMALLER " + guess_num + " .");
                System.out.println();
            }
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        Random rand = new Random(); 
        int upperbound = 50;
        int random_num = rand.nextInt(upperbound);
    
        int guess_num = 0;
        int guess_count = 0;
        int chance = 10;

        System.out.println("---------GUESS THE RANDOM NUMBER-------");
        System.out.println("-YOU WILL HAVE 10 CHANCE");
        System.out.println("-Choose number between 0 to 50.");
        System.out.println("---------------------------------------\n");
    
        while(guess_num != 15){
            guess_count++;
            
            System.out.print("Guess your number : ");
            guess_num = input.nextInt();
            System.out.println("----------------------------------------------");

            if(guess_num == random_num){
                System.out.println();
                System.out.println("CONGRATULATION YOUR GUESS A CORRECT NUMBER!");
                System.out.println("YOU HAVE TRY " + guess_count + " TIMES.");
                System.out.println("----------------------------------------------");
                System.out.println();
                break;
            }
            else if(guess_num < random_num){     
                System.out.println("THE NUMBER IS BIGGER THAN " + guess_num + " .");
                System.out.println();
            }
            else if(guess_num > random_num){
                System.out.println("THE NUMBER IS SMALLER " + guess_num + " .");
                System.out.println();
            }

            if(guess_count == chance){
                System.out.println();
                System.out.println("You have exhausted try again later ^_^.");
                System.out.println("The correct number is " + random_num);
                System.out.println("YOU HAVE TRY " + guess_count + " TIMES.");
                System.out.println("----------------------------------------------");
                break;
            }

        }
        // System.out.println();
        // System.out.println("Your number " + guess_num+  " is correct!");
        // System.out.println("You have try " + guess_count + " times");
        
        input.close();
    }
}