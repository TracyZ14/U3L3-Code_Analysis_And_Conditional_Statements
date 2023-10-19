import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n"))
        {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");

            /* add nested if statements for possible next actions! */
            System.out.println("Which way do you want to go (l, r)?");
            String direction = scan.nextLine();
            if(direction.equals("l"))
            {
                System.out.println("You walked towards the left. \nYou realized that there was a tiger hiding in the tall grasses there. \nHow should you try to escape (c, r)?");
                String escape = scan.nextLine();
                if(escape.equals("c"))
                {
                    System.out.println("You decided to climb the tree. \nThe tiger, unable to reach you, left after a period of time.");
                }
                if(escape.equals("r"))
                {
                    System.out.println("The tiger attacked you as you were running away. \nRealizing that your meat was not delicious, it stopped chasing you. \nAfter running a long distance, you realized that you lost too much blood. \nYou died.");
                }
            }
            if(direction.equals("r"))
            {
                System.out.println("You walked towards the right. \nYou realized that there were monkeys hiding in the trees. \nDespite wanting to eat the fruits on the trees, you realized that you were outnumbered, and decided to leave.");
            }
        }

        // Add else-ifs for s, e, and an else for any other input. Be creative!
        else if(command.equals("s"))
        {
            System.out.println("You find that the path leads to the ocean. \nYou see that there are fishes in the sea, and a sea snake stranded on the beach. \nWhich one should you eat (f, s)?");
            String food = scan.nextLine();
            if(food.equals("f"))
            {
                System.out.println("You tried to catch the fish in the sea. \nHowever, the fishes all swam away when you come near, so you didn't manage to catch anything to eat.");
            }
            if(food.equals("s"))
            {
                System.out.println("Thinking that it would be too difficult to catch the fish, you decided to just eat the sea snake. \nHowever, you didn't handle the sea snake properly and got poisoned.");
            }
        }
        else if(command.equals("e"))
        {
            System.out.println("You find that the path leads to a beach shack. \nYou see that there is a boat with oars by the beach shack, and there is a bed in the beach shack. \nShould you try to leave the island on the boat or rest in the beach shack (b, r)");
        }
        else if(command.equals("w"))
        {

        }
        else
        {
            System.out.println("You can't go in that direction");
        }



        System.out.println("End of adventure!");
    }
}