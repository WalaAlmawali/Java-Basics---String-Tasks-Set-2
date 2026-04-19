public class CatDogExample {
    public static void main(String[] args){

        CatDogExample ex1 = new CatDogExample();
        ex1.catDog("catdog");


    }

    public  boolean catDog(String str) {

        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {

            String sub = str.substring(i, i + 3);

            if (sub.equals("cat")) {
                catCount++;
            }

            if (sub.equals("dog")) {
                dogCount++;
            }
        }
        if(catCount == dogCount){
            return true;
        }

        return false;
    }

    }
