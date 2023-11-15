public class Main {
    public static void main(String[] args) {
        boolean isWeatherGood = false;
        boolean isNotRaining = true;
        boolean isSunShining = true;
        boolean isCloudy = false;
        //Ветр. ли ?
        boolean isWindy = false;

        //Логическая операция И - &&
        //   false    =  true               false
        //   false   =   false               true
        //   false   =   false               false
        //   true    =   true               true
        //                                             //Не ветр.ли ?
        isWeatherGood = isNotRaining && isSunShining && !isWindy && !isCloudy;


        //Логическая операция ИЛИ - ||
        //   true    =  true               false
        //   true   =   false               true
        //   false   =   false               false
        //   true    =   true               true
        isWeatherGood = isNotRaining || isSunShining;


        //Логическая операция НЕ - !
        isWeatherGood = !isCloudy;

        System.out.println("Хорошая ли погода? " + isWeatherGood);


        }
    }