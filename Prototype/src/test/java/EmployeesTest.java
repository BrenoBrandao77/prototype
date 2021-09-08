import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeesTest {

    @Test
    void test() throws CloneNotSupportedException {
        EmpregadosLista emps = new EmpregadosLista();
        emps.loadData();
        EmpregadosLista empsNew = (EmpregadosLista) emps.clone();
        EmpregadosLista empsNew1 = (EmpregadosLista) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Kleber");
        assertEquals(list, empsNew1.getEmpList());
    }


}