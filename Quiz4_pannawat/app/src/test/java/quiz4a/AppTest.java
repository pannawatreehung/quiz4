import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // ตัวอย่าง 1 ให้สร้าง Employee(1, "John Doe", 50000) และตรวจสอบว่าเงินเดือนเป็น 50000
    @Test
    void createEmployee() {
        Employee employee = new Employee(1, "John Doe", 50000);
        assertEquals(50000, employee.calculateSalary());
    }

    // ข้อ 2 ตรวจสอบว่า Salary ตั้งให้ติดลบไม่ได้
    @Test
    void SalaryCannotBeNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(2, "Jane Doe", -10000);
        });
        assertEquals("Salary cannot be negative", exception.getMessage());
    }

    // ข้อ 3 ตรวจสอบว่า Bonus เป็น 20% ของเงินเดือน(Salary)
    @Test
    void Bonus20() {
        Manager manager = new Manager(3, "Alice Smith", 60000, "Sales");
        assertEquals(12000, manager.getBonus(), 0.01);
    }
}
