public class Application {
    public static void main(String[] args) {
        System.out.println("hello world");
        ArifmeticSum a  = new ArifmeticSum(2,3);
        BuhSum b = new BuhSum(6,7);
        DogSum c = new DogSum(3,5);
        D d = new D(b);
        System.out.println(d.print());

    }
}
