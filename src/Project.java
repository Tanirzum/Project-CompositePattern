public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstDeveloper = new JavaDeveloper();
        Developer secondDeveloper = new JavaDeveloper();
        Developer thirdDeveloper = new CppDeveloper();

        team.addDeveloper(firstDeveloper);
        team.addDeveloper(secondDeveloper);
        team.addDeveloper(thirdDeveloper);
        team.removeDeveloper(secondDeveloper);

        team.creatProject();
    }
}
