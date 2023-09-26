package 자바기초;

public class day16 {
    public static void main(String[] args) {

    }

    public String solution1(String myString) {
        return myString.toUpperCase();
    }

    public String[] solution3(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if(i%2==0){
                strArr[i] = strArr[i].toLowerCase();
            }else{
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
    public String solution4(String myString) {
        myString = myString.toLowerCase();
        return myString.replaceAll("a","A");
    }
    public String solution5(String my_string, String alp) {
        return my_string.replaceAll(alp,alp.toUpperCase());
    }

}

