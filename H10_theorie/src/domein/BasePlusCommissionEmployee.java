package domein;

public class BasePlusCommissionEmployee extends Employee {

	private double baseSalary; 		// basisloon per week

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate, double baseSalary)
    {
        super( firstName, lastName, socialSecurityNumber, grossSales, commissionRate );
        setBaseSalary(baseSalary);
    }

     public final void setBaseSalary(double baseSalary)
    {
        if(baseSalary < 0.0) 
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        else
            this.baseSalary = baseSalary;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    // berekent het weekloon van de werknemer: 
    // basisloon + commissiepercentage op zijn verkoopcijfers
    @Override
    public double earnings()
    {
        return baseSalary + (getCommissionRate() * getGrossSales());
    }

    @Override
    public String toString()
    {
        return String.format(
                "%s%n%s: %.2f",
                super.toString(),
                "base salary", baseSalary);
    }

}
