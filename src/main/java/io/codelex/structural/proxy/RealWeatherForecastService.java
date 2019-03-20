package io.codelex.structural.proxy;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

class RealWeatherForecastService implements WeatherForecastService {
    private static final Random RANDOM = new Random();
    private final List<String> conditions = asList("Snow", "Sun", "Rain");

    @Override
    public WeatherForecast find() {
        int index = RANDOM.nextInt(conditions.size());
        return new WeatherForecast(conditions.get(index));
    }
}
