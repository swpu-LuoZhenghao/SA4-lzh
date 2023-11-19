package org.example;



import javax.jws.WebService;

@WebService
public class WeatherService implements IWeatherService {

    @Override
    public double cal(double lzh){
        if (lzh <= 50000) {
            return lzh * 0.1;
        } else {
            return 50000 * 0.1 + (lzh - 50000) * 0.2;
        }
    }



}

