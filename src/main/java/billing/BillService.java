package billing;

/**
 * Created by Akshay on 23-09-2020.
 */
public class BillService {
    private IBill bill;

    public void setBill(IBill bill) {
        this.bill = bill;
    }

    public double calculateBill(Item item1,Item item2,Item item3,Item item4){
        return bill.calculateBill(item1, item2, item3, item4);
    }
}
