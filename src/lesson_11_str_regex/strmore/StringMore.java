package lesson_11_str_regex.strmore;

import java.util.Arrays;

public class StringMore {
    public static void main(String[] args) {
        // CODE
    }

    public static void setP2toP1(){
        Person p1 = new Person("Archil");
        Person p2 = p1; // p2 -> p1, под него у меня отдельно памяти нет
        System.out.println(p2);
    }

    public static void getStringBasics(){
        // PRINTF()
        // String.equals(), String == String
        // String hashCode()
        // Object + String
        String welcomingMsg = "Welcome to Java";

        // ПОЧЕМУ ТАК НЕ ДЕЛАЕМ? ЕСЛИ НЕТ ОСОБЕННОЙ НУЖДЫ?
        String welcomingMsgNew = new String("Welcome to Java");

        String welcomingMsgDuplicate = "Welcome to Java";
        String welcomingMsgWrongDuplicate = "Welcome to JAVA";

        // Why equals()?
        // String == String
        System.out.println("welcomingMsg.equals(welcomingMsgNew): " +
                welcomingMsg.equals(welcomingMsgNew)); // Правильная форма проверки значения это equals()


        System.out.println("welcomingMsg == welcomingMsgNew, где второе создано через new: " +
                (welcomingMsg == welcomingMsgNew));
        System.out.println("-".repeat(80));

        // Если вы пробросили в Стринг ПУЛ переменные типа СТРИНГ и они указывают на одинаковые объекты
        // То они всегда будут друг другу равны и по адресам и по значениям
        System.out.println(welcomingMsgDuplicate.equals(welcomingMsgWrongDuplicate));
        System.out.println(welcomingMsgDuplicate == welcomingMsgWrongDuplicate); // Сравнение адресов
    }

    public static void getHashCodeString(){
        // hashCode - это уникальный цифровой идентификатор, обычно типа int, возможно long
        // У каждого объекта ЕСТЬ СВОЙ УНИКАЛЬНЫЙ ЦИФРОВОЙ ИДЕНТИФИКАТОР
        // Это тема ОСОБЕННО АКТУАЛЬНА, КОГДА ВЫ РАБОТАЕТЕ С КОЛЛЕКЦИЯМИ
        // Но, она также используется для проверки и сортировки и других объектов
        String str = "Java";

        // & ALIAS
        String strUpperCase = "JAVA";
        String strDuplicate = "Java";
        String strNew = new String("Java");
        String strLowerCase = "java";

        // String address - Какое значение? Какой адрес? Какое сравнение?
        // Unique ID - hashCode - который, нарушает правила new и все равно задает схожее уникальное значение
        System.out.println("str.hashCode(): " + str.hashCode());
        System.out.println("strDuplicate.hashCode(): " + strDuplicate.hashCode());
        System.out.println("strUpperCase.hashCode(): " + strUpperCase.hashCode());
        System.out.println("strNew.hashCode(): " + strNew.hashCode());
        System.out.println("strLowerCase.hashCode(): " + strLowerCase.hashCode());

        // Один из хороших возможностей, проверить разные объекты, особенно в коллекциях и, например со строками,
        // это зная, что СХОЖИЕ КОНСТАНТЫ ДАЮТ СХОЖИЙ УНИКАЛЬНЫЙ ИДЕНТИФИКАТОР, СРАВНИТЬ ИДЕНТИФИКАТОРЫ
        // ПОСКОЛЬКУ, сравнение ЦЕЛОЧИСЛЕННЫХ ЗНАЧЕНИЙ ВСЕГДА БЫСТРЕЕ ДРУГИХ СРАВНЕНИЙ
        String strNUll = null;
        strNUll = "Archil"; // A r c h i l * 2 bytes = 12 bytes
        int hashCodeStr = 332432433;
        int hashCodeStr2 = 2323123;
    }

    public static void useFormattedOutput(){
        String str = "Archil Sikharulidze";
        String strConcat = str.concat(" is a JAVA DEVELOPER.");
        String strConcatPlus = str + " is a JAVA TMS Lecturer";

        String name = "Natalia";
        int lesson = 11;
        String pronounce = "she";

        System.out.println(name + " is a TMS student. And " + pronounce + " is on a " + lesson + " now.");

        // printf() - formatted string output
        // Форматированный вывод - возможность вложить определенные переменные непосредственно в строчку
        // name + " is a TMS student. And " + pronounce + " is on a " + lesson + " now."
        System.out.printf("%s is a TMS student. And %s is on a %d now.\n", name, pronounce, lesson);

        String formattedString = String.format("%s is a TMS student. And %s is on a %d now.\n", name, pronounce, lesson);
        System.out.println(formattedString);

        // Есть так называемые флажки
        // %s - строчка
        // %d - целое число
        // %c - символ
        // %f - дробное число
        // %b - логическая переменная
        char status = 'r';
        String location = "Hotel Ambassador";
        double time = 22.00;
        boolean isAvailable = true;

        // Дробная часть после знака %. - означает, покажи дробную часть с определенной точностью
        // .2 - после точки два знака + f указатель на дробную переменную
        System.out.printf("M%c your are welcomed here at the %s at %.2f. Are you available? %b.\n",
                            status, location, time, isAvailable);

        // STRING BLOCK - после первых трех кавычек надо перейти на новую строчку
        String blockString = """
                Welcome to Java programming language.
                This is a STRING BLOCK that keeps all formatting on the ground.
                You can give any form, shape and the content...
                ----------------------------------------------------------------
                !""";

        System.out.println("-".repeat(100));
        System.out.println(blockString);
    }

    public static void concatRules(){
        // charAt(), split(), trim(), replaceAll(), equals(),
        // equalsIgnoreCase(), toUpperCase(), toLowerCase()
        System.out.println("Archil".equalsIgnoreCase("ARCHIL"));
        System.out.println(" Archil Sikharulidze   ".trim());
        System.out.println("ARCHIl".toLowerCase());
        System.out.println("archil".toUpperCase());

        // Все методы СТРОЧКИ являются с т.н. ЭХО
        String replaced = "Archil Sikharulidze".replaceAll("[chi]", "+");
        System.out.println(replaced);

        String arithmeticOperation = "15/9+5*19-17-16+10";
        String[] splitString = arithmeticOperation.split("[/+*-]");
        System.out.println(Arrays.toString(splitString));

        int height = 180;
        double weight = 76.45;

        // Будет калькуляция + 'с' + ""
        String concatNumbers = height + weight + 'c' + ""; // "" подсказывает компилятору, что это СТРОЧКА
        System.out.println(concatNumbers);

        // До появления первого символа СТРОКИ, даже "", он рассматривает как операция присваивания
        // 14 + height = 194
        // Дальше, когда появилось первое строковое значение, то он уже воспринимает остальное слева направо
        // как присоединение к строчку
        System.out.println(14 + height + " " + 13 + 5 + ". Welcome."); // после знака СТРОЧКИ какой-то он воспринимает,
        // как append
        System.out.println(14 + height + " " + (13 + 5) + ". Welcome."); // (13 + 5)
    }
}
