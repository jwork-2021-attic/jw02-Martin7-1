package W02.S201250182.taskThree;

/**
 * @class 蛇精类。指挥256个小怪来排序
 * @author Zyi
 * @create 2021/9/20 0:35
 */
@SuppressWarnings("JavaDoc")
public class Snake {

    /**
     * 通过静态变量来保证蛇精只有唯一的一个！
     */
    private static Snake theSnake;

    public static Snake getTheSnake() {
        if (theSnake == null) {
            theSnake = new Snake();
        }

        return theSnake;
    }

    private Snake() {}

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        // 设置我们排序的方法
        this.sorter = sorter;
    }

    public String lineUp(Matrix matrix, Monster[] monsters) {
        StringBuilder log = new StringBuilder();

        // 防御式编程
        if (sorter == null) {
            return null;
        }

        Linable[] linables = matrix.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step, monsters);
            log.append(matrix.toString());
            log.append("\n[frame]\n");
        }

        return log.toString();
    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step, Monster[] monsters) {
        String[] couple = step.split("<->");
        couple[0] = couple[0].trim();
        couple[1] = couple[1].trim();
        Monster monsterOne = null;
        Monster monsterTwo = null;

        for (Monster monster : monsters) {
            if (monster.getValue() == Integer.parseInt(couple[0])) {
                monsterOne = monster;
            }
            if (monster.getValue() == Integer.parseInt(couple[1])) {
                monsterTwo = monster;
            }

            if (monsterOne != null && monsterTwo != null) {
                break;
            }
        }

        monsterOne.swapPosition(monsterTwo);
    }
}
