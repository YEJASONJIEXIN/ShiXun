import java.io.*;     //导入输入输出包
public class Add 
{
    private int val1,val2;

    public void myFun(int x,int y)
    {
        val1=x;
        val2=y;
        System.out.println("the sum is "+(val1+val2));
    }
    
    //主函数
    public static void main(String arg[])
    {
        Add MyObj=new Add();  //新建一个MyClass实类
        MyObj.myFun(3,4);  //调用求和函数myFun
    }
}


