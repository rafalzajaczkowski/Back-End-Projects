/**
 * Created by jas on 2017-03-13.
 */
public class Auto
{
    String mark;
    String model;
    double accelerationTime;

    public double getAccelerationTime()
    {
        return accelerationTime;
    }

    public Auto(String Mark, String model, double accelerationTime)
    {
        this.mark = Mark;
        this.model = model;
        this.accelerationTime = accelerationTime;
    }

    public String getAutoName()
    {
        return "Marka:"+ mark +" Model:"+model+" Czas rozpędu do setki:"+ accelerationTime;
    }
}
