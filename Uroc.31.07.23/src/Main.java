public class Main {
    public static void main(String[] args) {
        int additionResult = 10;
        // пока  переменная  additionResult меньше или равно 1000 ми продолжаем виполнять блок {}
        // 0
        //10
        //20.....
        // 1010
        while (additionResult <=1000) {
            System.out.println("Значение additionResult:" + additionResult);
            additionResult = additionResult + 10;
        }

        System.out.println(additionResult);
    }
}