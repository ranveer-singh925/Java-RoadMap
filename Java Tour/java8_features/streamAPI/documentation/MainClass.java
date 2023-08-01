package java8_features.streamAPI.documentation;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        List<Sales> list= Arrays.asList(new Sales("B",LocalDate.of(2022,Month.MARCH,20),330003),new Sales("C",LocalDate.now(),33003));
        int totalAmount=0;
        for (Sales sales1: list){
            if (sales1.getDate().getMonth() == Month.JULY){
                totalAmount+=sales1.getAmount();
            }
        }
        System.out.println("total sales on month of march- "+ totalAmount);

        int sum = list.stream().filter(sales1 -> sales1.getDate().getMonth() == Month.JULY).mapToInt(Sales::getAmount).sum();
        System.out.println(sum);
    }
}


class Sales {
    String product;
    LocalDate date;
    int amount;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Sales(String product, LocalDate date, int amount) {
        this.product = product;
        this.date = date;
        this.amount = amount;
    }

    public Sales() {
    }

    @Override
    public String toString() {
        return "Sales{" +
                "product='" + product + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
