public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -5, 2};
        System.out.println(maxsubarr(array));
    }

    public static int maxsubarr(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int Max = array[0];
        int preSum = array[0];//保存子数组相加之和
        //从头开始遍历相加数组中的元素
        for (int i = 1; i < array.length; i++) {
            //若是相加之和一旦小于零，子数组从新开始，否则相加
            preSum = preSum < 0 ? array[i] : preSum + array[i];
            //sumMax保存最大的子数组的和
            Max = Math.max(Max, preSum);
        }

        return Max;
    }
}

