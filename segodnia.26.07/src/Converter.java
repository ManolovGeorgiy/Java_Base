public class Converter{

        float convert(float tempC) {
        float tempK = tempC + 273.15f;
        float tempF = tempC * 9 / 5 + 32;
        System.out.println("Температура по Цельсию: " + tempC);
        System.out.println();
        System.out.println("Температура по Кельвину: " + tempK);
        System.out.println();
        System.out.println("Температура по Фаренгейту: " + tempF);
        System.out.println();
        return tempK;

        }

}
