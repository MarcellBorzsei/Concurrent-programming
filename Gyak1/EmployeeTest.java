public class EmployeeTest {
    public static void main(String[] args)
    {
        Manager manager = new Manager("Alice", 80000);

        // Létrehozunk beosztottakat
        Subordinate subordinate1 = new Subordinate("John Doe", 50000);
        Subordinate subordinate2 = new Subordinate("Jane Smith", 60000);

        // Hozzáadjuk a beosztottakat a menedzser listájához
        manager.addEmployee(subordinate1);
        manager.addEmployee(subordinate2);

        // Menedzser és beosztottak fizetésének kiíratása
        System.out.println("Menedzser fizetés (beosztottak nélkül): " + manager.getSalary());
        System.out.println("Beosztott 1 fizetése: " + subordinate1.getSalary());
        System.out.println("Beosztott 2 fizetése: " + subordinate2.getSalary());

        // Menedzser fizetése a beosztottak fizetésének 5%-ával
        System.out.println("Menedzser fizetés (beosztottakkal): " + manager.getSalary());
    }
}
