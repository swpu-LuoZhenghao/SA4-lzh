package org.example;

import java.util.Scanner;



public class calculatorSystem {
    public static void main(String[] args) {
        //创建服务视图对象  wsdl中<service name>
        WeatherServiceService service = new WeatherServiceService();
        //获取服务的实现类  wsdl中<portType name>
        WeatherService port = service.getPort(WeatherService.class);
        Scanner sc=new Scanner(System.in);
        System.out.println("感谢你使用罗正豪的个税计算器");
        System.out.println("纳税规则：\n小于等于50000的部分纳十分之一的个人所得税\n超出50000的部分纳五分之一的个人所得税");
        System.out.println("---------------------------------------------");
        while (true){
            System.out.println("你正在使用个人所得税计算器，请输入你的年收入：");

            double income=sc.nextDouble();
            //调用方法 在<portType 标签下面有<operation name="query">
            double sum = port.cal(income);
            System.out.println("你应该交税:"+sum+"元");
            System.out.println("计算完毕：【1】继续  【2】退出");
            int choice=sc.nextInt();
            if (choice==1){

            }else {
                break;
            }
        }



    }
}

