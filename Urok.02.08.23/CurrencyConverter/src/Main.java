
public class Main {
    public static void main(String...args) {
        //изначальноеЗначение
        double initialValue = 100;

        System.out.println("Сумма на счёте(USD): " + 100);

        //сконвертированноеЗначение
        double convertedValue = CurrencyConverter.convertToCurrency(initialValue, false, false);


        System.out.println("Конвертированное значение: " + convertedValue);

    }
}
