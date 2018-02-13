package com.galvanize;

public class LightSaber {

    private static float EFFICIENCY = 10.0f;

    private float charge = 100.0f;
    private long jediSerialNumber;
    private String color = "green";

    public LightSaber(long jediSerialNumber){
        this.jediSerialNumber = jediSerialNumber;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCharge() {
        return charge;

    }

    public long getJediSerialNumber() {
        return jediSerialNumber;
    }

    public String getColor() {
        return color;
    }

    public void use(float minutes) {
        charge -= (EFFICIENCY / 60.0f) * minutes;
    }

    public float getRemainingMinutes() {
        return ((charge/EFFICIENCY)*30);
    }

    public void recharge(){
        charge = 100.0f;
    }

//    @Override
//    public String toString() {
//        return "LightSaber{" +
//                "charge=" + charge +
//                ", jediSerialNumber=" + jediSerialNumber +
//                ", color='" + color + '\'' +
//                '}';
//    }
}
