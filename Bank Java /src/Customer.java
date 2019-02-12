import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addtransaction(initialAmount);

    }

    public void addtransaction(double amount){
        this.transaction.add(amount);

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction(Double Transaction) {
        return transaction;
    }
}
