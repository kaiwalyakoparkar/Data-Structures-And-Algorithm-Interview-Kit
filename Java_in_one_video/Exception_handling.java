public class Exception_handling{

    public static void main(String[] args){

        int a[] = new int[3];

        try{
            System.out.println(2/0);//This will cause error
        }catch(Exception e){
            //This will ignore the error and will only report us that error had occured.
            System.out.println("Error occured here!");
            System.out.println(e.getLocalizedMessage());
        }
    }
}