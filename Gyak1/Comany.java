import java.util.ArrayList;
import java.util.List;

public class Comany {
    private List<SalariedEntity> salariedEntities;

    public void addSalariedEntity(SalariedEntity salariedEntity)
    {
        salariedEntities.add(salariedEntity);
    }

    public void delSalariedEntity(SalariedEntity salariedEntity)
    {
        salariedEntities.remove(salariedEntity);
    }

    public void raiseEmployeeSalaries(double percentage)
    {
        for(SalariedEntity sal_entity : salariedEntities)
        {
            if(sal_entity instanceof Employee)
            {
                ((Employee) sal_entity).raiseSalary(percentage);
            }
        }
    }
}
