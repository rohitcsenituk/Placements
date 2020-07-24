package object_oriented_programming;

/**
 * Generation of Reference address
 */

public class ClassObjectRef {
    public static void main(String[] args) {
        ClassObjectRef objectRef = new ClassObjectRef();
        System.out.println(objectRef);
        int hash = objectRef.hashCode();
        System.out.println(hash);
        String classCode = Integer.toHexString(hash);
        System.out.println(classCode);
        Class a = objectRef.getClass();
        System.out.println(a);
        System.out.println(a + "@" + classCode);
    }
}
