package Assignment2.q1;

class EnumUsed
{
    public static void main(String[]args){
        for(House h:House.values()){
            System.out.println(h+" price is "+h.getPrice());
        }
    }
}
