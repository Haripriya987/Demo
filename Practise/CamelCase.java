public class CamelCase {
    public static String camelCase(String str) {
        String arr[] = str.split("[-\\s]+");
        String res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }
        res = res.replaceAll("\\s", "");
        return res;
    }

    public static void main(String args[]){
        String input = "hello - world - this is a test";
        String output=camelCase(input);
        System.out.println(output);
    }
}
