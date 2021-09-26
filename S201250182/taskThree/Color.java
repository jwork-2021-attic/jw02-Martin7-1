package W02.S201250182.taskThree;

import java.util.*;

/**
 * @class 颜色类，用于赋予每个小怪颜色
 * @author Zyi
 * @create 2021/9/20 0:10
 */
public class Color {

    private int r;
    private int g;
    private int b;
    private static Set<List<Integer>> rgb = new HashSet<>();

    public Color() {
        // 按一定规律为256只小怪分配颜色
        setRGB();
    }

    public Color(int rank) {
        // 按一定规律为64只小怪分配颜色
        this.r = 256 - rank * 4;
        this.g = rank * 4;
        this.b = rank * 4;
    }

    public void setRGB() {
        Random random = new Random();
        int randomR = random.nextInt(256) + 1;
        int randomG = random.nextInt(256) + 1;
        int randomB = random.nextInt(256) + 1;

        while (true) {
            List<Integer> tempRGB = new ArrayList<>();
            tempRGB.add(randomR);
            tempRGB.add(randomG);
            tempRGB.add(randomB);
            if (!haveSameRGB(tempRGB)) {
                this.r = randomR;
                this.g = randomG;
                this.b = randomB;
                break;
            } else {
                randomR = random.nextInt(256) + 1;
                randomG = random.nextInt(256) + 1;
                randomB = random.nextInt(256) + 1;
            }
        }
    }

    public boolean haveSameRGB(List<Integer> tempRGB) {
        boolean isHave = false;
        for (List<Integer> list : rgb) {
            if (list.get(0).intValue() == tempRGB.get(0).intValue() && list.get(1).intValue() == tempRGB.get(1).intValue() && list.get(2).intValue() == tempRGB.get(2).intValue()) {
                isHave = true;
                break;
            }
        }

        if (!isHave) {
            rgb.add(tempRGB);
        }

        return isHave;
    }

    public int getR() {
        return this.r;
    }

    public int getG() {
        return this.g;
    }

    public int getB() {
        return this.b;
    }
}
