import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Expense> list = new ArrayList<>();

        FixedExpense fixed1 = new FixedExpense("Internet", 100);
        FixedExpense fixed2 = new FixedExpense("Supermarkt", 500);

        VariableExpense variable1 = new VariableExpense("Credit Card", 300,1);

        list.add(fixed1);
        list.add(fixed2);
        list.add(variable1);

        for(Expense l : list){
            System.out.println(l.getDescription());
        }

    }
}
