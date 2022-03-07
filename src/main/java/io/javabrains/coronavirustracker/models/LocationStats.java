package io.javabrains.coronavirustracker.models;

public class LocationStats {

    private String country;
    private String state;
    private int latestTotalCases;
    private int diffPrevDay;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public int getDiffPrevDay() {
        return diffPrevDay;
    }

    public void setDiffPrevDay(int diffPrevDay) {
        this.diffPrevDay = diffPrevDay;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
