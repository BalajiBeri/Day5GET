package java8features;
interface MyFunctional
{
    void addNums();
}
interface Bank
{
    void deposit(int amount);
}
public class SAMDemo
{
public static void main(String[] args)
{
        MyFunctional obj=()->{
            System.out.println("Welcome to Lambda");
        };
        obj.addNums();

        Bank icic=(amount)->{
            System.out.println("Bank Deposit of Rs:"+amount);
        };
        icic.deposit(1000);

}
}
