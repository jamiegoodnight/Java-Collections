package collections;

public class Dogs
{
    private String breed;
    private int avgWeight;
    private boolean apartment;

    public Dogs(String breed, int avgWeight, boolean apartment)
    {
        this.breed=breed;
        this.avgWeight=avgWeight;
        this.apartment=apartment;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    
    public int getAvgWeight()
    {
        return avgWeight;
    }

    public void setAvgWeight(int avgWeight)
    {
        this.avgWeight = avgWeight;
    }

    // some people use is instead of get for boolean values

    public boolean getApartment()
    {
        return apartment;
    }

    public void setApartment(boolean apartment)
    {
        this.apartment=apartment;
    }

    public String toString()
    {
        String rtnStr = "Dogs{" + 
                        "breed:" + breed + "\n" +
                        "avgWeight: " + avgWeight + "\n" +
                        "apartment:" + apartment + 
                        "}" + "\n";
        return rtnStr;
    }

}