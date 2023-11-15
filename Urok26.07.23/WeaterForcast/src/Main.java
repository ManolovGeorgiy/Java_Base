public class Main {
    public static void main(String[] args) {
       WeaterForcast weaterForcast = new WeaterForcast();


       System.out.println("Идет ли дождь:"+ weaterForcast.isRaining);
       weaterForcast.isRaining = true;



            WeaterForcast weaterForcast1 = new WeaterForcast();
            System.out.println("Светит ли солнце:"+ weaterForcast.isSunShining);
            weaterForcast.isSunShining = true;



    }

    public static void printIsRainingInfo(WeaterForcast weaterForcast){
        WeaterForcast weaterForcast1 = new WeaterForcast();
        System.out.println("Сшетит ли солнце:"+ weaterForcast.isSunShining);
        weaterForcast.isSunShining = true;


    }

    public static  void wereFalsificationsPresent(ExitPoll exitPoll){
        ExitPoll exitPoll1 = new ExitPoll();
        System.out.println("pravda li?" + exitPoll.wereFalsificationsPresent);

    }
}
