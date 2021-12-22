package ru.mirea.task23.opt;

public class LuxuryAuto
{

    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }

    public void SetModel(String model)
    {
        this.model = model;
    }

    public void SetManufactureYear(int year)
    {
        this.manufactureYear = year;
    }

    public void SetDollarPrice(int price)
    {
        this.dollarPrice = price;
    }

    public String GetModel()
    {
        return model;
    }

    public int GetManufactureYear()
    {
        return manufactureYear;
    }

    public int GetDollarPrice()
    {
        return dollarPrice;
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LuxuryAuto that = (LuxuryAuto) o;

        if (manufactureYear != that.manufactureYear) return false;
        if (dollarPrice != that.dollarPrice) return false;
        return model.equals(that.model);
    }

    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + manufactureYear;
        result = 31 * result + dollarPrice;
        return result;
    }

    public static void main(String[] args)
    {
        LuxuryAuto ferrariGTO1 = new LuxuryAuto("Ferrari 250 GTO", 1963, 70000000);
        LuxuryAuto ferrariGTO2 = new LuxuryAuto("Ferrari 250 GTO", 1963, 70000000);
        LuxuryAuto bmw = new LuxuryAuto("BMW iX", 2021, 116000);
        LuxuryAuto mercedes = new LuxuryAuto("Mercedes 300 SL Gullwing", 1955, 2600000);
        LuxuryAuto lamborghini = new LuxuryAuto("Lamborghini Veneno Roadster", 2014, 8600000);

        System.out.println("Is " + ferrariGTO1.GetModel() + " equal to " + ferrariGTO2.GetModel() + "?");
        System.out.println((ferrariGTO1.hashCode() == ferrariGTO2.hashCode()));
        System.out.println(ferrariGTO1.GetModel() + " hash is: " + ferrariGTO1.hashCode());
        System.out.println(ferrariGTO2.GetModel() + " hash is: " + ferrariGTO2.hashCode());
        System.out.println();
        System.out.println("Is " + bmw.GetModel() + " equal to " + mercedes.GetModel() + "?");
        System.out.println((bmw.hashCode() == mercedes.hashCode()));
        System.out.println(bmw.GetModel() + " hash is: " + bmw.hashCode());
        System.out.println(mercedes.GetModel() + " hash is: " + mercedes.hashCode());
        System.out.println();
        System.out.println("Is " + lamborghini.GetModel() + " equal to " + ferrariGTO1.GetModel() + "?");
        System.out.println((lamborghini.hashCode() == ferrariGTO1.hashCode()));
        System.out.println(lamborghini.GetModel() + " hash is: " + lamborghini.hashCode());
        System.out.println(ferrariGTO1.GetModel() + " hash is: " + ferrariGTO1.hashCode());
    }
}