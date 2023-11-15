import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // циклы ( for, while, do-while )
        //оператор ветвления ( if, switch, if-else )
        //+ - / * %
        //методы
        //присвоение
        //логические операции(и " && ", или " || "; не " ! ") - true,folce
        //конструкторы
        //больше >= , меньше <=, или = равно.....

  // ***********************************************************************

        //Переменние
        //число
        int number = 10;
        int number1 = 10;
        int number2 = 10;
        int number3 = 10;
        int number4 = 10;
        int number5 = 10;
        int number6 = 10;
        int number7 = 10;
        int number8 = 10;
        int number9 = 10;

        System.out.println("Переменная number" + number1);

        // Arrays - массивы
        //числа
        int[] numbers = new int[10];
        System.out.println(numbers[0]);

     //**************************************************************************

        numbers[8] = 5;


        int numberOn8thPosition = numbers[8];
        System.out.println(numberOn8thPosition);
//******************************************************************************
        Scanner scanner = new Scanner(System.in);
        int[] intNumbers = {1, 2, 3, 4, 5, 6 ,7, 8, 9};

        double[] doublesNumbers = {2.0, 15.0, 20.0};

        for(int counter = 0; counter <= 3; counter ++){
         //   System.out.print("polizovateli,vvedi mne,pojaluista,chislo:");
            System.out.println("counter =" + counter);

         //   doublesNumbers[counter] = scanner.nextDouble();
        }
//*************************************************
    }


        Scanner scanner = new Scanner(System.in);
        int[] intNumbers = {1, 2, 3, 4, 5, 6 ,7, 8, 9};

        double[] doublesNumbers = {2.0, 15.0, 20.0};

        for(int counter = 0; counter <= 3; counter ++){
              System.out.print("polizovateli,vvedi mne,pojaluista,chislo:");
           // System.out.println("counter =" + counter);

               doublesNumbers[counter] = scanner.nextDouble();
        }

        System.out.println(doubleNumbers[1]);
}
}
//***********************************************************************