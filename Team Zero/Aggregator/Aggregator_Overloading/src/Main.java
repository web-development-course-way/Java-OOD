import java.util.ArrayList;
class Aggregator {
    public static String aggregate(String str1,String str2){
        return str1 + str2;
    }
    public static Integer aggregate(Integer num1,Integer num2){
        return num1 + num2;
    }
    public static String aggregate(Object object1,Object object2){
        return object1.toString() + object2.toString();
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<String> outputs1 = new ArrayList<>();
        outputs1.add("test1");
        outputs1.add("test2");

        ArrayList<String> outputs2 = new ArrayList<>();
        outputs2.add("test1");
        outputs2.add("test2");

        System.out.println(Aggregator.aggregate("Str1","Str2"));
        System.out.println(Aggregator.aggregate(1,2));
        System.out.println(Aggregator.aggregate(outputs1,outputs2));
    }
}