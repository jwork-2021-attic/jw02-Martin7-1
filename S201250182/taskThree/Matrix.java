package S201250182.taskThree;

/**
 * @class matrix: 将64个小怪按8x8排列
 * @author Zyi
 * @create 2021/9/21 15:33
 */
@SuppressWarnings("JavaDoc")
public class Matrix {

    private Position[] positions;

    public Matrix(int length) {
        this.positions = new Position[length];
    }

    public void put(Linable linable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setLinable(linable);
    }

    public Linable get(int i) {
        if (i < 0 || i > positions.length) {
            return null;
        } else {
            return positions[i].linable;
        }
    }

    @Override
    public String toString() {
        StringBuilder lineString = new StringBuilder();
        for (int i = 0; i < positions.length; i++) {
            lineString.append(positions[i].linable.toString());
            if (i % 7 == 0 && i != 0) {
                lineString.append("\n");
            }
        }

        return lineString.toString();
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;
    }

    class Position {

        private  Linable linable;

        Position(Linable linable) {
            this.linable = linable;
        }

        public void setLinable(Linable linable) {
            this.linable = linable;
            linable.setPosition(this);
        }
    }
}
