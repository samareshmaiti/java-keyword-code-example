public class NumberDemo {
     public static void main(String[] args) {
         Integer g = 6;
        Integer d = 4;
        Double c = Double.valueOf(5);
        Float fl = Float.valueOf("62");
        System.out.println(g.compareTo(6));
        System.out.println(g.compareTo(4));

        System.out.println(g.equals(d));
        System.out.println(c);
        System.out.println(fl);

        Integer h = 22;
        System.out.println(h.toString());
        System.out.println(Integer.toString(22));

        Integer val = -5;
        System.out.println(Math.abs(val));

        double val2 = -200.456;
        System.out.println(Math.ceil(val2));
        System.out.println(Math.floor(val2));
    }


}

