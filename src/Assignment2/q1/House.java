package Assignment2.q1;

enum House{
    APARTMENT(2500000),
    VILLA(8000000),
    BUNGALOW(12000000);

    private int price;

    House(int price){
        this.price=price;
    }

    int getPrice(){
        return price;
    }
}
