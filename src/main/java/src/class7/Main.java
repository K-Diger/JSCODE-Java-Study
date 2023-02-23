package src.class7;

public class Main {

    public static void main(String[] args) {
        GymStarter gymStarter = DependencyFactory.getGymStarter();
        gymStarter.execute();
    }
}
