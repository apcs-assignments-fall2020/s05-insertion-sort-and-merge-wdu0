import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        for (int n=0; n<list.size(); n++) {
            re.add(Integer.MIN_VALUE);
        }
        for (int i=0; i<list.size(); i++) {
            int num1 = list.get(i);
            int j = i - 1;
            while (j >= 0 && re.get(j) > num1) {
                re.set(j+1, re.get(j));
                j--;
            }
            re.set(j+1, num1);
        }
        return re;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] re = new int[arr1.length + arr2.length + 1];
        int ind1 = 0;
        int ind2 = 0;
        for (int n=0; n<re.length; n++) {
            
            while ((!(arr1[arr1.length]==Integer.MIN_VALUE))||(!(arr2[arr2.length]==Integer.MIN_VALUE))) {
                if (arr1[n+ind1] > arr2[n+ind2]) {
                    re[n] = arr2[n+ind2];
                    arr2[n+ind2] = Integer.MIN_VALUE;
                    ind2++;
                } else if (arr1[n+ind1] < arr2[n+ind2]) {
                    re[n] = arr1[n+ind1];
                    arr1[n+ind1] = Integer.MIN_VALUE;
                    ind1++;
                }
            }
        }
        return re;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(2);
        System.out.println(insertionSort(l1));
        int[] l2 = {1, 4, 7};
        int[] l3 = {2, 5, 9};
        System.out.println(merge(l2, l3));
    }
}
