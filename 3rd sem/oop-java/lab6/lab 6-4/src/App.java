public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "Java, DSA, SAD, Prob and Stat, Web Tech";
        String[] arr = s1.split(",");
        int i;
        for (i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
