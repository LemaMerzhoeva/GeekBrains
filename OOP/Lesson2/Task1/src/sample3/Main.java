package sample3;

public class Main {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Барсик", 1500, 300),
                new Cat("Персик", 1700, 220),
                new Robot("R2D2", 99999, 0),
                new Robot("C3P0", 5000, 50),
                new Human("Петя", 2500, 150),
                new Human("Вася", 3500, 320)
        };

        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(250)
        };

        int i;
        for (Runner runner: runners){
            i = 0;
            for (Obstacle obstacle: obstacles){
                if (obstacle instanceof Wall) {
                    if (!runner.jump(obstacle.getHeight())){
                        break;
                    }
                }
                else if (obstacle instanceof Track){
                    if(!runner.run(obstacle.getLength())){
                        break;
                    }
                }
                i++;
            }
            if (i == obstacles.length) {
                System.out.print("\nБегун смог преодолеть все препятствия!!!\n\n");
            }
            System.out.println("___________________________________________________");
        }
    }
}
