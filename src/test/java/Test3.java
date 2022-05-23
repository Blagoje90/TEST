public class Test3 {
    public static void main(String[] args){

        String s = "Rahul Shetty Academy";
        String[] splittedString = s.split("Shetty");
        System.out.println(splittedString[0]);
        for(int i = s.length()-1; i>=0; i--)
        {

            System.out.println(s.charAt(i));


        }



    }
}
