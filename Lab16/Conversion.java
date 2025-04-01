package Lab16;

import java.io.*;

public class Conversion implements Serializable 
{
    private String fromUnit;
    private String toUnit;
    private double conversionRatio;

    public Conversion(String fromUnit, String toUnit, double conversionRatio) 
    {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.conversionRatio = conversionRatio;
    }

    public double convert(double value) 
    {
        return value * conversionRatio;
    }

    public String getFromUnit() 
    {
        return fromUnit;
    }

    public String getToUnit() 
    {
        return toUnit;
    }

    public double getConversionRatio() 
    {
        return conversionRatio;
    }

    @Override
    public String toString() 
    {
        return fromUnit + " to " + toUnit + ": " + conversionRatio;
    }
}
