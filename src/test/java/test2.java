import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3, 4, 5, 9, 18, 21, 100};

        for (int i = 0; i < arr2.length; i ++) {
            if (arr2[i]%2 == 1) {


                System.out.println(arr2[i]);
            }


        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("rahul");
        a.add("Shitty");
        a.add("academy");
        a.add("Program");
        System.out.println(a.get(2));


    }
}
