package cn.itcast.day04.demo02;

/*

有参数：小括号中有内容，当一个方法需要一些数据条件，才能完成任务的时候。
例如：两个数字相加，必须知道这两个数字各是多少，才能相加。

无参数：小括号中留空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。
例如：定义一个方法，打印固定10次HelloWord。

*/

public class Demo03MethodParam {
    public static void main(String[] args) {

        method1(20,30);

        System.out.println("============");

        method2();
    }

    //两个数字想乘，做乘法，必须知道两个数字各自是多少，否则无法进行计算
    //有参数
    public static void method1(int a, int b){
        int result = a * b;
        System.out.println("结果是：" + result);

    }

    //打印输出固定10次文本串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,World!!" + i);
        }



    }



}
