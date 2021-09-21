package S201250182.taskThree;

/**
 * @interface 排序类。拥有排序的部分共性
 * @author Zyi
 * @create 2021/9/20 0:38
 */
@SuppressWarnings("JavaDoc")
public interface Sorter {

    /**
     * 加载需要排序的元素
     * @param elements 需要排序的元素
     */
    void load(int[] elements);

    /**
     * 排序
     */
    void sort();

    /**
     * 获取交换的双方
     * @return 交换双方
     */
    String getPlan();
}
