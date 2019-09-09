import org.junit.Test;

/*
斐波那契数列，又称黄金分割数列
一列数的规则如下: 1、1、2、3、5、8、13、21、34 ，求第30位数是多少？使用递归实现 
 */
public class DiguiTest {
    public static int setI(int i) {
        if (i<=2)
            return 1;
        else
            return setI(i -2) + setI(i -1);
    }
    @Test
    public void runTest(){
        DiguiTest test = new DiguiTest();
        System.out.println(test.setI(4));
    }

}
