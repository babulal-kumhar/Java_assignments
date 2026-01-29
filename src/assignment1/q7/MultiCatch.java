package assignment1.q7;

class MultiCatch{
    public static void main(String[]args){
        try{
            int a=10;
            int b=0;

            System.out.println(a/b);

            int[]arr=new int[3];
            arr[5]=20;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred: "+e);
        }
        finally{
            System.out.println("finally block always executes");
        }
    }
}
