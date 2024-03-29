public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        byte boys=2;
        short toys=213;
        int littleBirds=431;
        long seeds= 75624L;
        float bread=2.5f;
        double cake=23.25;
        System.out.println("Значение переменной boys с типом byte равно " + boys);
        System.out.println("Значение переменной toys с типом short равно " + toys);
        System.out.println("Значение переменной littleBirds с типом int равно " + littleBirds);
        System.out.println("Значение переменной seeds с типом long равно " + seeds);
        System.out.println("Значение переменной bread с типом float равно " + bread);
        System.out.println("Значение переменной cake с типом double равно " + cake);
        System.out.println("Exercise 2");
        float sugar=27.12f;
        long people=987678965549L;
        double salt= 2.786;
        char car=569;
        short money=-159;
        int butterfly=27897;
        byte cat=67;
        System.out.println("Exercise 3");
        byte pupilsLuPa=23;
        byte pupilsAnSe=27;
        byte pupilsEkAn=30;
        int allPupils=pupilsLuPa+pupilsAnSe+pupilsEkAn;
        int paper=480;
        int paper1=paper/allPupils;
        System.out.println("На каждого ученика рассчитано "+paper1+" листов бумаги");
        System.out.println("Exercise 4");
        byte bottle=16;
        byte time=2;
        int bottleMinute=bottle/time;
        int time1=20;
        int time2=24*60;
        int time3=3*time2;
        int time4=30*time2;
        int bottle1=bottleMinute*time1;
        int bottle2=bottleMinute*time2;
        int bottle3=bottleMinute*time3;
        int bottle4=bottleMinute*time4;
        System.out.println("За 20 минут машина произвела "+bottle1+" штук бутылок");
        System.out.println("За сутки машина произвела "+bottle2+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+bottle3+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+bottle4+" штук бутылок");
        System.out.println("Exercise 5");
        int all=120;
        int wight=all/3;
        int brown=all*2/3;
        int room=120/6;
        System.out.println("В школе, где "+room+" классов, нужно "+wight+" банок белой краски и "+brown+" банок коричневой краски.");
        System.out.println("Exercise 6");
        int bananas=5*80;
        int milk=2*105;
        int iceCream=2*100;
        int eggs=4*70;
        int allG=bananas+milk+iceCream+eggs;
        float allKg=allG/1000f;
        System.out.println("Масса завтрака "+allG+" грамм или "+allKg+" килограмм.");


    }
}