public class Main {
    public static void main(String[] args) {
        //Задача№1
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг" +
                    " совершеннолетия, нужно немного подождать");
        }

        //Задача№2
        int Temperature = 10;
        if (Temperature < 5) {
            System.out.println("На улице " + Temperature +  " градусов. На улице холодно, нужно надеть шапку");
        }
        if (Temperature > 5) {
            System.out.println("На улице " + Temperature + " градусов. На улице тепло, можно идти без шапки");
        }

        //Задача№3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed == 60) {
            System.out.println("Если скорость " + speed + " притормози, а то заплатишь штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed +  " , то можно ездить спокойно");
        }

        //Задача№4
        int Age = 23;
        if (Age >= 2 && Age <= 6) {
            System.out.println("Если человеку " + Age + ", то ему нужно ходить в детский сад");
        }
        if (Age >= 7 && Age <= 17) {
            System.out.println("Если человеку " + Age + ", то ему нужно ходить в школу");
        }
        if (Age >= 18 && Age <= 24) {
            System.out.println("Если человеку " + Age + ", то его место в университете");
        }
        if (Age > 24) {
            System.out.println("Если человеку " + Age + ", то ему пора бы уже на работу");
        }

        //Задача№5
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно " +
                    "кататься только со взрослыми ");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься " +
                    "без сопровождения взрослого");
        }

        //Задача№6
        int people = 101;
        if (people >= 102 && people >= 60 && people >= 42) {
            System.out.println("Вагон полностью забит");
        } else {
            System.out.println("В вагоне есть места");
        }

        //Задача№7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >two && one >three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two>three) {
            System.out.println("Число two больше остальных");
        } else if (three > one && three > two) {
            System.out.println("Число three больше остальных");
        }

    }
}