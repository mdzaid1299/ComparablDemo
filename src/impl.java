
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        List<Address> reg = Arrays.asList(new Address ("Jane" , "marblle" , "gk", "joj",110065),
        new Address ("Sara", "tl" , "hu" , "fd", 110054));
        Collections.sort(reg);
        for (Address no : reg) {
            System.out.println(no);
        }
    }
}