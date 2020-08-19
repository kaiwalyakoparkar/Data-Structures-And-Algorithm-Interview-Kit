public class Switch_Case {
    public static void main(String[] args){
        
        char name = 'A';

        switch(name){//Defining the switch variable as name
            case 'A'://checking for A
                System.out.println("Very good!");
                break;//if true then get s breaked

            case 'B'://Chcking for B
                System.out.println("It's average!");
                break;//if true then gets breaked

            case 'C'://Checking for C
                System.out.println("It is very bad");
                break;//if yes gets breaked

            default://If nothing matches then this executes
                System.out.println("Wrong Argument");
        }
    }
}