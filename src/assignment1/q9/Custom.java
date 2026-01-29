package assignment1.q9;

class NoTraceException extends Exception{

    NoTraceException(String message){
        super(message);
    }

    public Throwable fillInStackTrace(){
        return this;
    }
}

class Custom{
    public static void main(String[]args){
        try{
            throw new NoTraceException("This exception has no stack trace");
        }
        catch(NoTraceException e){
            System.out.println(e);
        }
    }
}
