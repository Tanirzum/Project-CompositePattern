import java.util.*;

public class Team {
    private List<Developer> list = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        list.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        list.remove(developer);
    }

    public void creatProject() {
        System.out.println("Team creat Project...");
        for (Developer developer : list) {
            developer.writeCode();
        }
    }
}
