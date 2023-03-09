package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     * <p>
     * Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        double value = 6.7;
        double valueSquareRoot = Math.sqrt(value);

        System.out.println("The value square root is = " + valueSquareRoot);

    }

    /**
     * 2: See the code below
     * <p>
     * Print out the highest value using Math.max()
     * <p>
     * Then print out the lowest value using Math.min()
     * <p>
     * You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;
        int maximumValue = Math.max(valueA, valueB);
        int minimumValue = Math.min(valueA, valueB);

        System.out.println("Max = " + maximumValue);
        System.out.println("Min = " + minimumValue);

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        int remainingAmount = totalMoney % costPerBurger;
        // Write your code here
        System.out.println("Remainder = " + remainingAmount);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     * <p>
     * You do not need to write any code
     * <p>
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Math.ceil arrotonda per eccesso il numero decimale al numero intero superiore
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Math.floor fa l'inverso di ceil, arrotondando per difetto.
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // Math.round arrotonda il risultato ad un numero intero aggiungendo 1/2 ovvero 0,5.
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Math.pow restituisce il valore del primo argomento elevato alla potenza del secondo argomento
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Qui stessa operazione fatta in precedenza ma il tutto è elevato alla terza
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Math.random restituisce un numero di tipo double casuale
        //darà numeri diversi ad ogni esecuzione che possono essere
        // maggiore di, uguali a zero e minore di uno
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}