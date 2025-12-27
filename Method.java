class G {
    int a;
    String b;
    float c;

    int sumOfTwo(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        G obj = new G();               // create object
        int result = obj.sumOfTwo(12311, 1203); // call method
        System.out.println(result);    // output
    }
}
