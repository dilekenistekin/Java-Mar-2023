package com.baharkaradavut.company.staff;

public class Worker extends Employee {
    private double m_feePerHour;
    private int m_hourPerDay;

    //...


    public double getFeePerHour()
    {
        return m_feePerHour;
    }

    public void setFeePerHour(double feePerHour)
    {
        //...
        m_feePerHour = feePerHour;
    }

    public int getHourPerDay()
    {
        return m_hourPerDay;
    }

    public void setHourPerDay(int hourPerDay)
    {
        //...
        m_hourPerDay = hourPerDay;
    }
}
