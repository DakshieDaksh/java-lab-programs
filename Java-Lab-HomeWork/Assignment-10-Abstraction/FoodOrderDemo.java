abstract class FoodOrder {
    double amount;

    FoodOrder(double amount) {
        this.amount = amount;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + (amount * 0.10); // 10% service charge
        System.out.println("Dine-In Bill: $" + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + 30; // $30 packing charge
        System.out.println("Take Away Bill: $" + total);
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {
        FoodOrder order1 = new DineInOrder(800);
        FoodOrder order2 = new TakeAwayOrder(800);

        order1.calculateBill();
        order2.calculateBill();
    }
}