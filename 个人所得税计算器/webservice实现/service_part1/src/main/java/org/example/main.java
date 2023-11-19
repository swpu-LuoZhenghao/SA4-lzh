package org.example;

import javax.xml.ws.Endpoint;

public class main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/weatherService",new WeatherService());
        System.out.println("罗正豪的个人所得税计算服务发布成功");
    }
}

