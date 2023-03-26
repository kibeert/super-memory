public class Error {
    public static void main(String[] args) {
        try {
            int[] Mynumbers = { 1, 2, 3, 4, 5 };
            System.out.println(Mynumbers[4]);
        } catch (Exception e) {
            System.out.println("array not in the array");
        } finally {
            System.out.println("the try and catch is finished");
        }
    }
}