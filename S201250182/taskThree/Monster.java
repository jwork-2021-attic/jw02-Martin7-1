package W02.S201250182.taskThree;

import W02.S201250182.taskThree.Matrix.Position;

/**
 * @author Zyi
 */

public class Monster implements Linable {
    private final Color color;
    private final int rank;

    private Position position;

    Monster(Color color, int rank) {
        this.color = color;
        this.rank = rank;
    }

    private int getRank() {
        // 获取当前小怪的编号，从1-256
        return this.rank;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public int getValue() {
        return this.getRank();
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.color.getR() + ";" + this.color.getG() + ";" + this.color.getB() + ";38;2;0;0;0m    " + this.getRank() + "  \033[0m";
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }
}
