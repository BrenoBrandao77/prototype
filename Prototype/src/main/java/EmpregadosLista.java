import java.util.ArrayList;
import java.util.List;

public class EmpregadosLista implements Cloneable{

    private List<String> empList;

    public EmpregadosLista(){
        empList = new ArrayList<String>();
    }

    public EmpregadosLista(List<String> list){
        this.empList=list;
    }
    public void loadData(){

        empList.add("Jorge");
        empList.add("Kleber");
        empList.add("Machado");
        empList.add("Lado");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new EmpregadosLista(temp);
    }

}