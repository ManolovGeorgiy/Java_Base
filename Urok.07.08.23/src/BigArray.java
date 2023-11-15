import static java.lang.Integer.MAX_VALUE;

public class BigArray {

    private int[] part1OfArray = new int[MAX_VALUE];
    private int[] part2OfArray = new int[MAX_VALUE];


    public int getArrayValueAtIndex(int part1, int part2) {
        if ((part1 + part2) >= MAX_VALUE) {
            return part2OfArray[part2];
        }

        return part1OfArray[part1];
    }
}