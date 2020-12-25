public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Shykat");
        System.out.println(sb);

        sb.append(" & world");// insert element at last position
        System.out.println(sb);

        sb.insert(20, " java");// insert string at 20th index
        System.out.println(sb);
        // String s1="How are you";
        StringBuffer ss = new StringBuffer("Hello");

        ss.replace(1, 5, "i java");// Replace index 1 to 5 by 'i java'
        System.out.println(ss);

        StringBuffer se = new StringBuffer("I am good");
        se.reverse();
        System.out.println(se);

        StringBuffer si = new StringBuffer("I am good");
        si.delete(3, 5);
        System.out.println(si);

        StringBuffer str = new StringBuffer("");
        System.out.println(str.capacity());// By default capacity of all String Buffer is 16

        System.out.println(str.append("This is another approach"));
        System.out.println(str.capacity());// it will increased by ((2*old capacity)+2)=(2*16)+2=34
        str.append(" of java");
        System.out.println(str);
        // System.out.println();
        System.out.println(str.capacity());
    }
}
