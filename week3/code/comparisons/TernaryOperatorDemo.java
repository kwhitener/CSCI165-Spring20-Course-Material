public class TernaryOperatorDemo{

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = value1 < value2;
        result = someCondition ? value1 : value2;

        System.out.println(result + " is the smallest value");
    }
}

