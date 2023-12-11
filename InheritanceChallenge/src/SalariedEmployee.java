public class SalariedEmployee extends Employee{

    double annualSalery;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalery) {
        super(name, birthDate, hireDate);
        this.annualSalery = annualSalery;
    }
    @Override
    public double collectPay() {
        double paycheck = annualSalery / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }
        public void retire() {
            terminate("12/12/2025");
            isRetired = true;
        }
    }