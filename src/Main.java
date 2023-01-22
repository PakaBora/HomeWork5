public class Main {
    public static void main(String[] args) {
///задание1
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Нужно еще подождать!");
        }
        ///задание 2
        int humanAge = 23;
        if (humanAge >= 7 && humanAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (humanAge > 18 && humanAge <= 24) {
            System.out.println("Пора в университет!");
        }
        else {
            System.out.println("Пора работать!");
        }
        ///задание 3
        int place =115;
        if(place<=60){
            System.out.println("Cидячее место");
        }
        if(place>60 && place<=102){
            System.out.println("Стоячее место");
        }
        else{
            System.out.println("Жди следующий поезд!");
        }
        ///задание 4
        int lifeTime = 44;
        boolean kinderGarten = lifeTime >= 2 && lifeTime <= 6;
        boolean schoolBoy = lifeTime >= 7 && lifeTime <= 18;
        boolean student = lifeTime >= 18 && lifeTime <= 24;

        if (kinderGarten) {
            System.out.println("Если возраст человека равен " + lifeTime + " ,то ему нужно ходить в детский сад");
        }
        if (schoolBoy) {
            System.out.println("Если возраст человека равен " + lifeTime + " ,то ему нужно ходить в школу");
        }
        if (student) {
            System.out.println("Если возраст человека равен " + lifeTime + " ,то ему нужно ходить в институт");
        }
        if (lifeTime > 24) {
            System.out.println("Если возраст человека равен " + lifeTime + " ,то ему нужно ходить на работу");
        }
        ///Задание 5
        int childAge = 77;
        boolean noAttraction = childAge < 5;
        boolean attractionWithParents = childAge > 5 && childAge <= 14;
        boolean attraction = childAge > 14;
        if (noAttraction) {
            System.out.println("Кататься на аттракциноах еще рано!");
        }
        if (attractionWithParents) {
            System.out.println("Кататься на аттракциноах c родителями!");
        }
        if (attraction) {
            System.out.println("Кататься на аттракциноах можно одному!");
        }
        ///задание 6
        int one = 3;
        int two = 3;
        int three = 3;

        if (one > two) {
            if (one >= three) {
                System.out.println("Max value is" + one);
            } else {
                System.out.println("Max value is " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Max value is " + two);
            } else {
                System.out.println("Max value is " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Max value is " + one);
            } else if (three > one) {
                System.out.println("Max value is " + three);
            } else {
                System.out.println("All values is equal " );
            }
        }


    }
}
