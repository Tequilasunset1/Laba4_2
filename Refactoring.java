import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Refactoring {
    private List<Computer> comps;
    public Refactoring() {
        this.comps = new ArrayList<>();
    }

    //Meтод добавления элементов
    public void addComp(Computer comp) {
        this.comps.add(comp);
    }
    //Метод удаления
    public void removeComp(Computer comp) {
        this.comps.remove(comp);
    }
    //Метод изменения
    public void updateDetail(Computer oldComp, Computer newComp) {
        int index = this.comps.indexOf(oldComp);
        if (index >= 0) {
            this.comps.set(index, newComp);
        }
    }
   /* public Computer findDetailWithDifferentForm() {
        for (Computer comp : comps) {
            if (comps.stream().filter(d -> !d.equals(comp)).noneMatch(d -> d.getForm().equals(comp.getForm()))) {
                return comp;
            }
        }
        return null;
    }*/

    //Метод получение списка элментов
    public List<Computer> getComps() {
        return this.comps;
    }
}
