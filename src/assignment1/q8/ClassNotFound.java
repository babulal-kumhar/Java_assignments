package assignment1.q8;

class ClassNotFound{
    public static void main(String[]args){
        try{
            Class.forName("Unknown");
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception occurred: "+e);
        }
    }
}
