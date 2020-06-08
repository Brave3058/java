package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) godCopyOf(a, 10);
        System.out.println(Arrays.toString(a));
        String[] b = {"tom", "dick", "harry"};
        System.out.println(Arrays.toString(b));
        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);
    }

    public static Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    public static Object godCopyOf(Object a, int newLenth) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentTpye = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentTpye, newLenth);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLenth));
        return newArray;
    }
}
