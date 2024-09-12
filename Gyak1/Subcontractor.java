public class Subcontractor implements SalariedEntity{
    private long taxId;
    private double salary;

    public Subcontractor(long taxId, double salary) {
        this.taxId = taxId;
        this.salary = salary;
    }

    public long getTaxId()
    {
        return this.taxId;
    }

    @Override
    public double getSalary()
    {
        return this.salary;
    }
}
