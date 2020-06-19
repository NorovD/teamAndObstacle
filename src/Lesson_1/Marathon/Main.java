package Lesson_1.Marathon;


public class Main {
    public static void main(String[] args) {

        MixedTeam[] team1 = {new Human("Человек", "Аркадий", 400,2,34,true), new Cat("Кошка", "Валера", 324,5,0, true), new Dog("Пёс", "Баркли",600,2,50,true)};
        Obstacle[] course = {new Cross(80), new Water(5), new Wall(1), new Cross(120)};
        for (MixedTeam c : team1) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (MixedTeam c : team1) {
            c.info();
        }



    }
}