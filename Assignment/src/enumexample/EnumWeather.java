package enumexample;
import java.time.LocalDate;

public enum EnumWeather {
	RAINY(LocalDate.of(2021,7,10),25f){
		
	},
	SUNNY(LocalDate.of(2021,8,10), 35f){

		@Override
		public void goodWeather() {
			System.out.println("It s SUNNY");
		}
		
		
		
	},
	HERBST(LocalDate.of(2021,9,10), 10f){
		
	};
	
	private LocalDate date;
	private float temp;
	
	
	
	
	private EnumWeather(LocalDate date, float temp) {
		this.date = date;
		this.temp = temp;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public float getTemp() {
		return temp;
	}
	
	public void goodWeather() {
		System.out.println("Good Weather");
	}

	
}
