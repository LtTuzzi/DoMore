

import java.util.Scanner;

public class DoMore {
    
    public static void main(String[] args){
        
        System.out.println("==========DoMore==========");
        System.out.println("What's on your mind?");
        System.out.println("(1,2,3)\n1.Add\n2.Remove\n3.Update");

        Scanner scanner = new Scanner(System.in);

        if (args.length < 1){
            System.out.println("Usage: java DoMore <myChoice>");
            return;
        }
        
    int myChoice = Integer.parseInt(args[0]);

    if(myChoice == 1){
        System.out.println("add");
    }
    else if(myChoice == 2){
        System.out.println("remove");
    }
    else{
        System.out.println("update");
    }


    }
}
