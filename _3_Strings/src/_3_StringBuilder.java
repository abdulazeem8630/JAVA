public class _3_StringBuilder {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        //append()
        sb.append(" Programming");
        System.out.println(sb); //Same object modify hua.

        //Multiple Append
        StringBuilder sb1 = new StringBuilder();
        sb1.append("A");
        sb1.append("B");
        sb1.append("C");
        System.out.println(sb1);

        //insert()  Beech me value insert karta hai.
        StringBuilder sb2 = new StringBuilder("Jva");
        sb2.insert(1,'a');
        System.out.println(sb2);

        //delete()  Characters delete karta hai.
        sb.delete(4,16);
        System.out.println(sb);

        //deleteCharAt()
        sb.deleteCharAt(1);
        System.out.println(sb); //Jva Pro

        //replace()
        sb.replace(0,4,"Python");
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        //setCharAt()  Ek character change karta hai.
        sb.setCharAt(0,'k');
        System.out.println(sb);

        //Capacity  Default Capacity = 16
        StringBuilder cp = new StringBuilder();
        System.out.println(cp.capacity()); //16
        StringBuilder cp1 = new StringBuilder("Java");
        System.out.println(cp1.capacity()); //16+4 length = 20
        //Capacity Increase
        //Suppose Capacity 16 hai. Aur tum  17th character add karte ho.
        //Java automatically capacity increase karega.
        // Formula (New Capacity = Old Capacity × 2 + 2)

        //ensureCapacity()  Manual capacity increase.
        StringBuilder cp2 = new StringBuilder();
        cp2.ensureCapacity(100);
        System.out.println(cp2.capacity()); //100

        //setLength()  Length change karta hai.
        sb.setLength(2);
        System.out.println(sb); //ky
        sb.setLength(10);
        System.out.println(sb); //ky______

        //toString()  StringBuilder ko String me convert karta hai.
        StringBuilder str = new StringBuilder("Java");
        String s = str.toString();
        System.out.println(s);
        s.concat("Programming");
        System.out.println(s); //ab nhi hoga kyunki ab s ek string h stringbuilder nhi


    }
}
