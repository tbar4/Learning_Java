package Ch_07_Single_Dimensional_Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int key = 3;
        System.out.println("Location of key is at index: " + linearSearch(list, key));
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i ++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
