package LeetCodeTests;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4,3,5,66,12,43,25,5,42};
        QuickSort test = new QuickSort();
        test.quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    /**
     * 一次快速排序
     * @param array 数组
     * @param lo 数组的前下标
     * @param hi 数组的后下标
     * @return key的下标index，也就是分片的间隔点
     */
    public static int partition(int []array,int lo,int hi){
        /** 固定的切分方式 */
        int key=array[lo];//选取了基准点
        while(lo<hi){
            //从后半部分向前扫描
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo]=array[hi];
            //从前半部分向后扫描
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;//最后把基准存入
        return hi;
    }

    /**
     * 快速排序
     * @param array
     * @param lo
     * @param hi
     */
    public static void quickSort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        //进行第一轮排序获取分割点
        int index=partition(array,lo,hi);
        //排序前半部分
        quickSort(array, lo, index - 1);
        //排序后半部分
        quickSort(array,index+1,hi);
    }

}
