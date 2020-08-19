public class Switch_Case {
    public static void main(String[] args){
        
        char name = 'A';

        switch(name){
            case 'A':
                System.out.println("Very good!");
                break;
            case 'B':
                System.out.println("It's average!");
                break;
            case 'C':
                System.out.println("It is very bad");
                break;
            default:
                System.out.println("Wrong Argument")
        }
    }
}