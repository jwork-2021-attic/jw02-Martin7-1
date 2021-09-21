package S201250182.taskThree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Zyi
 */
public class Scene {

    public static void main(String[] args) throws IOException {
        Matrix matrix = new Matrix(64);
        Monster[] monsters = new Monster[64];
        Set<Integer> ranks = new HashSet<>();

        for (int i = 0; i < monsters.length; i++) {
            Random random = new Random();
            int randomRank = random.nextInt(64) + 1;
            int rank;
            while (true) {
                if (ranks.add(randomRank)) {
                    rank = randomRank;
                    break;
                } else {
                    randomRank = random.nextInt(64) + 1;
                }
            }
            Monster monster = new Monster(new Color(), rank);
            matrix.put(monster, 64 - rank);
            monsters[i] = monster;
        }
        // 创建一个蛇精
        Snake theSnake = Snake.getTheSnake();

        // 创建一个排列对象
//        Sorter bubbleSorter = new BubbleSorter();
//        theSnake.setSorter(bubbleSorter);
//        String bubbleSorterLog = theSnake.lineUp(matrix, monsters);
//
//        BufferedWriter writer;
//        writer = new BufferedWriter(new FileWriter("resultOfBubbleSorter.txt"));
//        writer.write(bubbleSorterLog);
//        writer.flush();
//        writer.close();

        Sorter quickSorter = new QuickSorter();
        theSnake.setSorter(quickSorter);
        String quickSorterLog = theSnake.lineUp(matrix, monsters);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("Task3ResultOfQuickSorter.txt"));
        writer.write(quickSorterLog);
        writer.flush();
        writer.close();
    }
}
