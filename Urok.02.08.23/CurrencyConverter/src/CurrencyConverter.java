
public class CurrencyConverter {
    public static double convertToCurrency(double initialValue, boolean isTurkishLira, boolean isEuro) {
        //сконвертированное значение
        double convertedValue = 0;

        //турецкая лира
        //если условие выполнено(=true), тогда я выполняю, что находится в следующем блоке{}.
        if (isTurkishLira) {
            System.out.println("Мы конвертируем вашу сумму в турецкую лиру!");
            convertedValue = initialValue * 3.14;
        }

        //евро
        if (isEuro) {
            System.out.println("Мы конвертируем вашу сумму в евро!");
            convertedValue = initialValue * 2;
        }

        return convertedValue;
    }
}