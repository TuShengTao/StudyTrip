# java基础
    static Integer test = 1;
//    Double a = 1;
//    Double a = (Double) 0;
//    Double a = (double) 0;
    //    Double b = (double)1;
    double c = 1;
//    Double d = (double) test;
    float v = (float) c;
    // 元素个数
    private int size = 0;
    Double a = (double) 11;
//    Integer i = (Integer) a;
//    Integer m = v;
//     Float F = 11;
//    Float F = (float)11;
    Integer mn = 1;
    int mg = 1;
//    Float ss = (float)mg;
    Float F = (float) 1;
    float f = 1;
//    Integer in = f;
//    Integer in = Integer.valueOf(f);
//    Integer in = Integer.valueOf((int)f);
//    int ssd = f;
    int ssd = (int)f;
    double dd = 12.1;
    int di = (int)dd;
    Integer ggg = (int)dd;
    Integer fs = (int)f;
    float fff = F;
//    Integer dfs = Integer.valueOf((int)F);
    Integer dfs = Integer.valueOf((int)fff);


    Float f2 = Float.valueOf(mn);
    Float f3 = Float.valueOf(mg);
    Float f4 = Float.valueOf(Integer.valueOf(mg));

    Float f1= Float.valueOf(1);
    
# jvm 结合自动拆箱、装箱
```
public class test { 
    public static void main(String[] args) {    
    
    objPoolTest(); 
    
    }
 
    public static void objPoolTest() {
        int i = 40;
        int i0 = 40;
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);
        Double d1=1.0;
        Double d2=1.0;
        
        System.out.println("i=i0\t" + (i == i0));
        System.out.println("i1=i2\t" + (i1 == i2));
        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));
        System.out.println("i4=i5\t" + (i4 == i5));
        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));    
        System.out.println("d1=d2\t" + (d1==d2)); 
        
        System.out.println();        
    }
}
```