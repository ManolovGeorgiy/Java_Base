import java.util.Random;

public class Main {
    public static void main(String...args) {
        Random random = new Random();
        Flower[] flowers = new Flower[10];
        String[] colors = {"red", "green", "violet", "yellow", "blue"};

        //инциализация
        for (int counter = 0; counter < flowers.length; counter++) {
            //случайонеЧисло
            int randomNumber = random.nextInt(5);
            flowers[counter] = new Flower();
            flowers[counter].color = colors[randomNumber];
        }

        for (int counter = 0; counter < flowers.length; counter++) {

            //цветок
            Flower flower = flowers[counter];
            //цветЦветка
            String flowerColor = flower.color;
            System.out.println("Цвет цветка:" + flowerColor);
        }


    }
}

/////////////////////////////////////////////

    Random random = new Random();
    Flower[] flowers = new Flower[10];
    String[] colors = {"red", "green", "violet", "yellow", "blue"};

//инциализация
        for (int counter = 0; counter < flowers.length; counter++) {
        //случайонеЧисло
        int randomNumber = random.nextInt(5);
        flowers[counter] = new Flower();
        flowers[counter].color = colors[randomNumber];
        }

        for (int counter = 0; counter < flowers.length; counter++) {
        //цветок
        Flower flower = flowers[counter];
        //цветЦветка
        String flowerColor = flower.color;
        System.out.println("Цвет цветка:" + flowerColor);
        }
}
}
