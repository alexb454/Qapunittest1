package Employee;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unit_price;
    static int count = 0;

    public Invoice(String i, String d, int q, double u) {
        this.id = i;
        this.desc = d;
        this.qty = q;
        this.unit_price = u;
        count++;
    }

    public Invoice(Invoice I) {
        this.id = I.id;
        this.desc = I.desc;
        this.qty = I.qty;
        this.unit_price = I.unit_price;
        count++;
    }


    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int q) {
        this.qty = q;
    }

    public double getUnitPrice() {
        return this.unit_price;
    }

    public void setUnitPrice(double u) {
        this.unit_price = u;
    }

    public double getTotal() {
        return(this.unit_price * this.qty);
    }

    public String toString() {
        return(getDesc() + " there is a total of " + this.qty + " at a price of "
                + this.unit_price + " for a total of " + getTotal() + " there is " + count + " invoices");
    }
}
