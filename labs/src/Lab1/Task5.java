/*
Завдання No 5. FizzBuzz.
Вивести в консоль числа від 1 до 100.
Замість чисел кратних 3 виводити Fizz,
замість чисел кратних 5 вивести Buzz.
Замість чисел що кратні і 3,і 5 вивести FizzBuzz.
*/

package Lab1;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
