package W02.S201250182.taskTwo;

/**
 * @author Zyi
 */
public class QuickSorter implements Sorter{

    int[] arr;
    private String plan = "";

    @Override
    public void load(int[] elements) {
        this.arr = elements;
    }

    @Override
    public void sort() {
        quickSort(arr, 0, arr.length - 1);
    }

    public void swap(int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        plan += "" + arr[i] + "<->" + arr[j] + "\n";
    }

    public void quickSort(int[] arr, int low, int high) {
        if(low > high){
            return;
        }
        int i = low;
        int j = high;
        //temp就是基准位
        int temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                swap(i, j);
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        swap(low, i);
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }

    @Override
    public String getPlan() {
        return this.plan;
    }
}
