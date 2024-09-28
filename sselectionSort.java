public class sselectionSort {

    public static void swap(int[] a, int i, int j) {
        int b = a[i];
        a[i] = a[j];
        a[j] = b;
    }

    public static void sort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    swap(a,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//run something that takes time


        int[] a = new int[]{1, 5, 2, 9, 0, -3, 2, 8};
        sort(a);
        long end = System.currentTimeMillis();
        for(int x : a) System.out.print(x + " ");
        System.out.print(end);
    }

}
