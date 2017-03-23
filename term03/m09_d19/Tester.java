package term03.m09_d19;

public class Tester {

    public static void main(String[] args) throws Exception {
        IntegerVector vector = new IntegerVector();

        vector.add(0);
        vector.add(1);
        vector.add(2);
        vector.add(2); vector.add(2); vector.add(2); vector.add(2); vector.add(2); vector.add(2); vector.add(2); vector.add(2); vector.add(2); vector.add(2); vector.add(2);
             
      
        System.out.println(vector.currentCapacity());
        

        vector.clear();
        System.out.println(vector.isEmpty());
    }
}