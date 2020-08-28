public class Logical_Operators{

    public static void main(String[] args){

        int age = 35;

        //Checking the and Operator
        if(age>18 && age<35){
            System.out.println("You can vote!");
            //If both the statements are true the only this block will execute
        }
        else{
            System.out.println("You can't vote!");
        }

        //Checking the or Operator
        if(age>18||age<90){
            System.out.println("You can vote !");
            //If any one of these is true then this statement becomes true and it gets executed
        }
        else{
            System.out.println("You cannot vote !");
        }

        //Checking the not Operator
        if(!(age>18)){
            System.out.println("You can vote");
            //If it would be if(age>18) then the statement would have been true but when we put ! at the beginning of it then the statement is changed to false and hence the else part gets executed
        }
        else{
            System.out.println("You cannot vote");
        }

    }
}