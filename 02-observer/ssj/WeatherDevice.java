import java.io.BufferedWriter;
import java.io.IOException;

public class WeatherDevice implements ISubject{
    public String DeviceName = "NoName";
    private WeatherData data = new WeatherData();

    @Override
    public WeatherData getData(){
        return data;
    }

    @Override
    public void setData(Object data){
        if (data instanceof WeatherData wdata){
            this.data.Set(wdata.getTemperature(), wdata.getHumidity(), wdata.getPressure());
            System.out.printf("Device '%s' is setting data%n", DeviceName);
            System.out.printf("%f, %f, %f%n", wdata.getTemperature(), wdata.getHumidity(), wdata.getPressure());
        }
        Notify();
    }

    // Custom Method to get instance information
    public void Info(BufferedWriter wr)
    {
        try{
            for (IObserver observer : Observers){
                if (observer instanceof WeatherDisplay WD){
                    wr.write("\n");
                    wr.write(new String("Observed by : " + WD.DisplayName + "\n"));
                }
            }
        } catch (IOException e) {}
    }
}