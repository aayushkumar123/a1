public class compiletimebinding {
    void add(int a,int b)
    {
        int result=a+b;
        System.out.println("result is"+result);
    }
    void add(float a,float b)
    {
        float result=a+b;
        System.out.println(result);
    }

    void add(int a,int b,int c)
    {
        int result=a+b+c;
        System.out.println(result);
    }
    public static void main(String [] args)
    {
        compiletimebinding cp=new compiletimebinding();
        cp.add(10,20);
        cp.add(10f,20f);
        cp.add(12,23,34);


    }

}
