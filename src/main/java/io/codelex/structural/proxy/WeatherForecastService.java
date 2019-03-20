package io.codelex.structural.proxy;

interface WeatherForecastService {
    WeatherForecast find();

    class WeatherForecast {
        private final String condition;

        WeatherForecast(String condition) {
            this.condition = condition;
        }

        public String getCondition() {
            return condition;
        }
    }
}
