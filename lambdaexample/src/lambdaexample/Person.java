package lambdaexample;

import java.util.Arrays;
import java.util.List;

public class Person{
//In Java 8:
	public static void main(String args[]) {
//List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//features.forEach(n -> System.out.println(n));
//
//
//// We can also iterate using method reference is denoted by :: (double colon) operator
//System.out.println("Using foe each \n");
//features.forEach(System.out::println);
//



//2)Map and Reduce example in Java 8 using lambda expressions


//Without using lambda expression
List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
for (Integer cost : costBeforeTax) {
      double price = cost + .12*cost;
      System.out.println(price);
}

// With Lambda expression using map
System.out.println("\n With Lambda expression using map\n");
costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);


//To find total price without using lambda expression
System.out.println("\n To find total price without using lambda expression\n");
double total = 0;
for (Integer cost : costBeforeTax) {
 double price = cost + .12*cost;
 total = total + price;
 
}
System.out.println("Total : " + total);

//Using lambda expression and reduce 
System.out.println("\n Using lambda expression and reduce \n");

double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
System.out.println("Total : " + bill);
}

}