public class Main {
    public static void main(String[] args) {
        BinOps bo = new BinOps();

        System.out.println(bo.sum("00000", "11111"));
        System.out.println(bo.sum("00001", "11111"));
        System.out.println(bo.sum("10101", "1010"));
        System.out.println(bo.sum("1", "1"));
        System.out.println("============================");
        System.out.println(bo.mult("00000", "11111"));
        System.out.println(bo.mult("1", "1"));
        System.out.println(bo.mult("10", "10"));
        System.out.println(bo.mult("11", "11"));

    }
}
