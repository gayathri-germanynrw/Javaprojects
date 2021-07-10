package enumexample;

public class EnumWeatherMain {
	public static void main(String[] args) {
		for(EnumWeather weather: EnumWeather.values()) {
			System.out.printf("%s\t %s \t %f \n",weather,weather.getDate(),weather.getTemp());
		}
	}

}
