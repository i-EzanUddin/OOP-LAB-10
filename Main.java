abstract class vehicle{
    protected String made;
    protected int year;
    protected String model;
    private double price;

    abstract public double calPrice();
    public void setPrice(double price){
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
class car extends vehicle{
    car(String made, String model, int year, double price){
        this.made = made;
        this.model = model;
        this.year = year;
        setPrice(price);
    }

    @Override
    public double calPrice() {
        double totalPrice = 0;
        if(getYear() < 3){totalPrice = getPrice() * 1.2;}
        else if (getYear() >= 3 && getYear() <= 10) {totalPrice = getPrice() * 0.9;}
        else if(getYear() > 10){totalPrice = getPrice() * 0.5;}
        else System.out.println("Invalid price");
        return totalPrice;
    }
}
class truck extends vehicle{
    protected int weight;
    
    truck(String made, String model, int year, double price, int weight){
        this.made = made;
        this.weight = weight;
        this.model = model;
        this.year = year;
        setPrice(price);
    }

    public double calPrice(){
        double TotalPrice;
        
        if(weight < 2){
            TotalPrice = getPrice() + 5000;
        } else if (weight >= 2 && weight <= 5) {
            TotalPrice = getPrice() + 10000;
        }
        else {
            TotalPrice = 20000 + getPrice();
        }
        return TotalPrice;
    }
}

class Main{
    public static void main(String[] args) {
        vehicle v = new car("Toyota","Civic",4,15000);
        vehicle v1 = new truck("BobCan","Honda", 12, 20000, 1);

        System.out.println("Final Price of Car: $"+ v.calPrice());
        System.out.println("Final Price of Truck: $"+ v1.calPrice());
    }
}

