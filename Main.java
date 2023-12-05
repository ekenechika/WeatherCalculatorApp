import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        WeatherLog log = new WeatherLog();
        Random rand = new Random();

        for (int day = 1; day <= 31; day++) {
            // Generate random temperature and wind data for the month of December 2023.
            Date date = new Date("2023-12-" + day);
            Temperature temperature = new Temperature(rand.nextInt(35));
            Pressure pressure = new Pressure(rand.nextInt(2000));
            Humidity humidity = new Humidity(rand.nextInt(100));

            // Calculate average wind speed and direction for the day
            float averageWindSpeed = calculateAverageWindSpeedForDay(day); // Replace with your calculation
            float averageWindDirection = calculateAverageWindDirectionForDay(day); // Replace with your calculation

            Speed windSpeed = new Speed(averageWindSpeed);
            Direction windDirection = new Direction(averageWindDirection);
            WindVelocity windVelocity = new WindVelocity(windSpeed, windDirection);

            // Add the randomly generated record to the log
            WeatherRecord sample = new WeatherRecord(date, temperature, windVelocity, pressure, humidity);
            log.addRecord(sample);
        }

        log.save("SimulatedWeatherData.txt");
    }

    // Placeholder method for calculating average wind speed for a day
    private static float calculateAverageWindSpeedForDay(int day) {
        return new Random().nextInt(50);
    }

    // Placeholder method for calculating average wind direction for a day
    private static float calculateAverageWindDirectionForDay(int day) {
        return new Random().nextInt(360);
    }
}