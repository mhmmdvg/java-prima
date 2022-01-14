public class test {
    public static void main(String[] args) {

        System.out.println("1 " + cekPrima(1));
        System.out.println("2 " + cekPrima(2));
        System.out.println("3 " + cekPrima(3));
        System.out.println("4 " + cekPrima(4));
        System.out.println("5 " + cekPrima(5));
        System.out.println("6 " + cekPrima(6));
        System.out.println("7 " + cekPrima(7));
        System.out.println("8 " + cekPrima(8));
        System.out.println("9 " + cekPrima(9));
        System.out.println("10 " + cekPrima(10));

//        listPrima();

    }

    static boolean cekPrima (int x) {
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    static void listPrima () {
        for(int i = 1; i < 11; i++){
            int bil = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    bil = bil + 1;
                }
            }
            if(bil == 2){
                System.out.print(i+" ");
            }
        }
    }
}
