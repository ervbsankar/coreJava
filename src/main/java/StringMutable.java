/**
 * Created by a513915 on 8/12/2015.
 */
public class StringMutable {
     static public final void main(String[] args) {
         String s = "Sankar";
         String z = "Sankar";
         System.out.println(Integer.toHexString(s.hashCode()));
         System.out.println(Integer.toHexString(z.hashCode()));
         s = "Raknas";
         System.out.println(Integer.toHexString(s.hashCode()));
         String y = new String("Edala");
         String m = new String("Edal");
         System.out.println(Integer.toHexString(y.hashCode()));
         System.out.println(Integer.toHexString(m.hashCode()));
         System.out.println(s + z);
        System.out.println(s + " "+y);
    }
}
