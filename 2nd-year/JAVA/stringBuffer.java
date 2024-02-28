import java.util.*;

public class stringBuffer {

    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("java");

        StringBuffer str2 = new StringBuffer("technology");

        System.out.println(str1.capacity());

        System.out.println(str2.capacity());

        System.out.println(str1.append(str2));

        System.out.println(str1);

        System.out.println(str1.insert(4, "new"));

        System.out.println(str1);

        System.out.println(str2.delete(2, 6));

        System.out.println(str2);

        System.out.println(str2.reverse());

    }

}
