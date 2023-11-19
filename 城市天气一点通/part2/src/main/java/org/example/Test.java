package org.example;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

import java.util.Scanner;

public class Test {
    public void  name(){
        //创建实例化对象
        WeatherWebService weatherWS = new WeatherWebService();
        //通过实例化对象创建接口
        WeatherWebServiceSoap serviceSoap = weatherWS.getWeatherWebServiceSoap();
        while (true){
            //传入城市，获取当前城市天气状况
            System.out.println("请输入你要查询的城市");
            Scanner sc=new Scanner(System.in);
            String city=sc.next();
            ArrayOfString arr = serviceSoap.getWeatherbyCityName(city);
            if(null != arr){
                //获取到对象转换成集合遍历
                for (String message: arr.getString()) {
                    System.out.println(message);
                }
            }
            System.out.println("查询完毕【1】继续查询  【2】退出");
            int choice=sc.nextInt();
            if (choice==1){

            }else {
                break;
            }
        }



    }
}


