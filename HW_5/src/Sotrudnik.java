public class Sotrudnik {                        //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

        private String fio;                     //1
        private String position;                //1
        private String eMail;                   //1
        private String tel;                     //1
        private int salary;                     //1
        private int age;                        //1


        public Sotrudnik(String name, String position, String eMail, String tel, int salary, int age) {
            this.fio = name;
            this.position = position;
            this.eMail = eMail;
            this.tel = tel;
            this.salary = salary;
            this.age = age;

        //    print();                            //Задание 3
            sotrudnik40();                      //Задание 5
        }                                       //2. Конструктор класса должен заполнять эти поля при создании объекта.

    //    public void print() {
    //        System.out.println("Фамилия Имя Отчество - " + fio + "; Должность - " + position + "; Email: " + eMail +"; Телефон: " + tel + "; Зарплата - " + salary + "; Возраст: " + age);
    //    }                                       //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

        public static void main(String[] args) {

            Sotrudnik[] sotrudniks = new Sotrudnik[5];
            sotrudniks[0] = new Sotrudnik("Rovina Anna", "Engineer", "ivivan@mailbox.com", "89222222222", 50000, 26);
            sotrudniks[1] = new Sotrudnik("Andreev Andrei", "Tehnik", "ivivan@mailbox.com", "89111111111", 20000, 20);
            sotrudniks[2] = new Sotrudnik("Lupinov Sergei", "Driver", "ivivan@mailbox.com", "89333333333", 35000, 45);
            sotrudniks[3] = new Sotrudnik("Petrova Svetlana", "Manager", "ivivan@mailbox.com", "84444444444", 50000, 33);
            sotrudniks[4] = new Sotrudnik("Ivanov Ivan", "BOSS", "ivivan@mailbox.com", "87777777777", 130000, 35);
        }                                       //4. Создать массив из 5 сотрудников.

        public void sotrudnik40() {
            while (age >= 40) {
                System.out.println("Фамилия Имя Отчество - " + fio + "; Должность - " + position + "; Email: " + eMail +"; Телефон: " + tel + "; Зарплата - " + salary + "; Возраст: " + age);
                break;
            }
        }                                       //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
}
