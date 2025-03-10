public class Manager extends Employee {
    private String department;
    private double bonus;

    public Manager(int employeeId, String name, double salary, String department) {
        super(employeeId, name, salary);
        this.department = department;
        // คำนวณโบนัสเป็น 20% ของเงินเดือน
        this.bonus = salary * 0.20;
    }

    public double getBonus() {
        return bonus;
    }
}
