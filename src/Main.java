public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog=8.0;
        System.out.println(dog);
        dog=dog+4;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        cat=cat+4;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        paper=paper+4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog=8.0;
        System.out.println(dog);
        dog=dog+4;
        System.out.println(dog);
        dog=dog-3.5;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        cat=cat+4;
        System.out.println(cat);
        cat=cat-1.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        paper=paper+4;
        System.out.println(paper);
        paper=paper-7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog= 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxerWeight= 78.2;
        System.out.println("Вес первого боксера"+ firstBoxerWeight+ "кг!");
        var secondBoxerWeight= 82.7;
        System.out.println("Вес второго боксера"+ secondBoxerWeight+ "кг!");
        var totalWeightBoxers=(firstBoxerWeight+secondBoxerWeight);
        System.out.println("Общий вес двух бойцов"+ totalWeightBoxers+ "кг!");
        var differenceWeight= (secondBoxerWeight-firstBoxerWeight);
        System.out.println("Разница в весе между бойцами"+ differenceWeight+ "кг!");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxerWeight= 78.2;
        System.out.println("Вес первого боксера"+ firstBoxerWeight+ "кг!");
        var secondBoxerWeight= 82.7;
        System.out.println("Вес второго боксера"+ secondBoxerWeight +"кг!");
        var differenceWeight= (secondBoxerWeight - firstBoxerWeight);
        System.out.println("Разница в весе между бойцами"+ differenceWeight +"кг!");
        var weightDifference=(secondBoxerWeight / firstBoxerWeight)%differenceWeight;
        System.out.println("Разница в весе"+ weightDifference +"%");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var openingHours = 640;
        System.out.println("Всего"+openingHours+"часов");
        var employeeDedicatesWork = 8;
        System.out.println("Каждый сотрудник посвещает"+ employeeDedicatesWork +"часов");
        var employeesCompany=(openingHours/employeeDedicatesWork);
        System.out.println("Всего работников компании"+employeesCompany+"человек");
        var moreEmployees=94;
        System.out.println("Другие работники"+moreEmployees);
        var allEmployees=(employeesCompany+moreEmployees);
        System.out.println("Всего работников"+allEmployees+"в компании");
        var workingHours=(openingHours/allEmployees);
        System.out.println("Если в компании работает"+allEmployees+"человек, то всего"+workingHours+"часов работы может быть поделено между сотрудниками");
    }
}