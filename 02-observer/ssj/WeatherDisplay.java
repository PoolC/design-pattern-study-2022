public class WeatherDisplay implements IObserver {
    public String DisplayName = "NoName";

    public void Update(Object data){
        if (data instanceof WeatherData wdata){
            System.out.printf("Display '%s' got the data%n", DisplayName);
            System.out.printf("%f, %f, %f%n", wdata.getTemperature(), wdata.getHumidity(), wdata.getPressure());
            DrawDisplay();
        }
    }

    private void DrawDisplay(){
        System.out.println("Draw");
    }
}
