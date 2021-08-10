public class HW_6 {

    public static void main(String[] args) {

        int runDistc = 200;
        int runDistd = 500;
        int swimmingDistc = 0;
        int swimmingDistd = 10;

        Cats cats1 = new Cats ("Финик",280, 5, 6);
        Cats cats2 = new Cats ("Дикий охотник", 60, 28, 8);
        Cats cats3 = new Cats ("Дафна", 45, 10, 3);

//        Cats[] cats[] = {                            //Так подразумевалось сделать
//                {new Cats("Финик","280", "5", "6")},
//                {new Cats("Дикий охотник", "60", "28", "8")},
//                {new Cats("Дафна", "45", "10", "3")},
//        };

        Dogs dogs1 = new Dogs ("Хора", 580, 100, 8);
        Dogs dogs2 = new Dogs ("Бакс", 250, 60, 12);
        Dogs dogs3 = new Dogs ("Зорро", 400, 70, 6);

//        Dogs[] dogs[] = {                             //Так подразумевалось сделать
//                {new Dogs("Хора", "580", "100", "8")},
//                {new Dogs("Бакс", "250", "60", "12")},
//                {new Dogs("Зорро", "400", "70", "6")},
//        };

        Animals[] animals = {cats1, cats2, cats3, dogs1, dogs2, dogs3};

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Animals) {
                ((Animals)animals[i]).getNickname();
                ((Animals)animals[i]).getRun();
                ((Animals)animals[i]).getAge();

                System.out.println("Животное по кличке " + ((Animals)animals[i]).getNickname() + " с максимальной дистанцией бега " + ((Animals)animals[i]).getRun() + " возрастом " + ((Animals)animals[i]).getAge() + " лет");
            }

            if (cats1 instanceof Animals) {
                ((Animals)cats1).getNickname();
                ((Animals)cats1).getRun();
                ((Animals)cats1).getAge();
                ((Animals)cats1).getSwimming();

                if (((Animals)cats1).getRun() <= runDistc) {
                    System.out.println("Животное " + ((Animals)cats1).getNickname() + " возраста " + ((Animals)cats1).getAge() + " лет не преодолело дистанцию");
                }
                else {
                    System.out.println("Животное " + ((Animals)cats1).getNickname() + " возраста " + ((Animals)cats1).getAge() + " лет справилось с дистанцией");
                }
                if (((Animals)cats1).getSwimming() >= swimmingDistc) {
                    System.out.println("Животное " + ((Animals)cats1).getNickname() + " возраста " + ((Animals)cats1).getAge() + " лет не знает такого действия");
                }
                else {
                    System.out.println("Животное " + ((Animals)cats1).getNickname() + " возраста " + ((Animals)cats1).getAge() + " лет не имеет такой возможности");
                }
            }
            if (cats2 instanceof Animals) {
                ((Animals)cats2).getNickname();
                ((Animals)cats2).getRun();
                ((Animals)cats2).getAge();
                ((Animals)cats2).getSwimming();

                if (((Animals)cats2).getRun() <= runDistc) {
                    System.out.println("Животное " + ((Animals)cats2).getNickname() + " возраста " + ((Animals)cats2).getAge() + " лет не преодолело дистанцию");
                }
                else {
                    System.out.println("Животное " + ((Animals)cats2).getNickname() + " возраста " + ((Animals)cats2).getAge() + " лет справилось с дистанцией");
                }
                if (((Animals)cats2).getSwimming() >= swimmingDistc) {
                    System.out.println("Животное " + ((Animals)cats2).getNickname() + " возраста " + ((Animals)cats2).getAge() + " лет не знает такого действия");
                }
                else {
                    System.out.println("Животное " + ((Animals)cats2).getNickname() + " возраста " + ((Animals)cats2).getAge() + " лет не имеет такой возможности");
                }
            }
            if (cats3 instanceof Animals) {
                ((Animals)cats3).getNickname();
                ((Animals)cats3).getRun();
                ((Animals)cats3).getAge();
                ((Animals)cats3).getSwimming();

                if (((Animals)cats3).getRun() <= runDistc) {
                    System.out.println("Животное " + ((Animals)cats3).getNickname() + " возраста " + ((Animals)cats3).getAge() + " лет не преодолело дистанцию");
                }
                else {
                    System.out.println("Животное " + ((Animals)cats3).getNickname() + " возраста " + ((Animals)cats3).getAge() + " лет справилось с дистанцией");
                }
                if (((Animals)cats3).getSwimming() >= swimmingDistc) {
                    System.out.println("Животное " + ((Animals)cats3).getNickname() + " возраста " + ((Animals)cats3).getAge() + " лет не знает такого действия");
                }
                else {
                    System.out.println("Животное " + ((Animals)cats3).getNickname() + " возраста " + ((Animals)cats3).getAge() + " лет не имеет такой возможности");
                }
            }


            if (dogs1 instanceof Animals) {
                ((Animals)dogs1).getNickname();
                ((Animals)dogs1).getRun();
                ((Animals)dogs1).getAge();
                ((Animals)dogs1).getSwimming();

                if (((Animals)dogs1).getRun() <= runDistd) {
                    System.out.println("Животное " + ((Animals)dogs1).getNickname() + " возраста " + ((Animals)dogs1).getAge() + " лет не преодолело дистанцию");
                }
                else {
                    System.out.println("Животное " + ((Animals)dogs1).getNickname() + " возраста " + ((Animals)dogs1).getAge() + " лет справилось с дистанцией");
                }
                if (((Animals)dogs1).getSwimming() >= swimmingDistd) {
                    System.out.println("Животное " + ((Animals)dogs1).getNickname() + " возраста " + ((Animals)dogs1).getAge() + " лет отлично искупалось");
                }
                else {
                    System.out.println("Животное " + ((Animals)dogs1).getNickname() + " возраста " + ((Animals)dogs1).getAge() + " лет ходит по дну");
                }
            }
            if (dogs2 instanceof Animals) {
                ((Animals)dogs2).getNickname();
                ((Animals)dogs2).getRun();
                ((Animals)dogs2).getAge();
                ((Animals)dogs2).getSwimming();

                if (((Animals)dogs2).getRun() <= runDistd) {
                    System.out.println("Животное " + ((Animals)dogs2).getNickname() + " возраста " + ((Animals)dogs2).getAge() + " лет не преодолело дистанцию");
                }
                else {
                    System.out.println("Животное " + ((Animals)dogs2).getNickname() + " возраста " + ((Animals)dogs2).getAge() + " лет справилось с дистанцией");
                }
                if (((Animals)dogs2).getSwimming() >= swimmingDistd) {
                    System.out.println("Животное " + ((Animals)dogs2).getNickname() + " возраста " + ((Animals)dogs2).getAge() + " лет отлично искупалось");
                }
                else {
                    System.out.println("Животное " + ((Animals)dogs2).getNickname() + " возраста " + ((Animals)dogs2).getAge() + " лет ходит по дну");
                }
            }
            if (dogs3 instanceof Animals) {
                ((Animals)dogs3).getNickname();
                ((Animals)dogs3).getRun();
                ((Animals)dogs3).getAge();
                ((Animals)dogs3).getSwimming();

                if (((Animals)dogs3).getRun() <= runDistd) {
                    System.out.println("Животное " + ((Animals)dogs3).getNickname() + " возраста " + ((Animals)dogs3).getAge() + " лет не преодолело дистанцию");
                }
                else {
                    System.out.println("Животное " + ((Animals)dogs3).getNickname() + " возраста " + ((Animals)dogs3).getAge() + " лет справилось с дистанцией");
                }
                if (((Animals)dogs3).getSwimming() >= swimmingDistd) {
                    System.out.println("Животное " + ((Animals)dogs3).getNickname() + " возраста " + ((Animals)dogs3).getAge() + " лет отлично искупалось");
                }
                else {
                    System.out.println("Животное " + ((Animals)dogs3).getNickname() + " возраста " + ((Animals)dogs3).getAge() + " лет ходит по дну");
                }break;
            }
//            if (Cats[i] instanceof Animals) {                //Так подразумевалось сделать
//                ((Animals)Cats[i]).getNickname();
//                ((Animals)Cats[i]).getRun();
//                ((Animals)Cats[i]).getAge();
//                ((Animals)Cats[i]).getSwimming();
//
//                if (((Animals)Cats[i]).getRun() <= runDistc) {
//                    System.out.println("Животное " + ((Animals)Cats[i]).getNickname() + " возраста " + ((Animals)Cats[i]).getAge() + " не преодолело дистанцию");
//                }
//                else {
//                    System.out.println("Животное " + ((Animals)Cats[i]).getNickname() + " возраста " + ((Animals)Cats[i]).getAge() + " справилось с дистанцией");
//                }
//                if (((Animals)Cats[i]).getSwimming() >= swimmingDistc) {
//                    System.out.println("Животное " + ((Animals)Cats[i]).getNickname() + " возраста " + ((Animals)Cats[i]).getAge() + " не знает такого действия");
//                }
//                else {
//                    System.out.println("Животное " + ((Animals)Cats[i]).getNickname() + " возраста " + ((Animals)Cats[i]).getAge() + " не имеет такой возможности");
//                }
//            }
////            if (Dogs[i] instanceof Animals) {
//                ((Animals)Dogs[i]).getNickname();
//                ((Animals)Dogs[i]).getRun();
//                ((Animals)Dogs[i]).getAge();
//                ((Animals)Dogs[i]).getSwimming();
//
//                if (Dogs[i].run() <= runDistd) {
//                    System.out.println("Животное " + ((Animals)Dogs[i]).getNickname() + " возраста " + ((Animals)Dogs[i]).getNickname() + " не преодолело дистанцию");
//                }
//                else {
//                    System.out.println("Животное " + ((Animals)Dogs[i]).getNickname() + " возраста " + ((Animals)Dogs[i]).getNickname() + " справилось с дистанцией");
//                }
//
//                if (((Animals)Dogs[i]).getSwimming() <= swimmingDistd) {
//                    System.out.println("Животное " + ((Animals)Dogs[i]).getNickname() + " возраста " + ((Animals)Dogs[i]).getNickname() + " не преодолело дистанцию");
//                }
//                else {
//                    System.out.println("Животное " + ((Animals)Dogs[i]).getNickname() + " возраста " + ((Animals)Dogs[i]).getNickname() + " справилось с дистанцией");
//                }
//            }
        }
    }
}