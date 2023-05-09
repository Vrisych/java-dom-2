/**
 * драгоценные камни
 */
public class pr0 {

    public static void main(String[] args) {
        int [] num = new int [2];
        String hoard = "aaaAbbbB";
        for (int i=0; i<hoard.length(); i++){
            if (hoard.charAt(i) == 'a'){
                num[0]++;
            }
            if (hoard.charAt(i) == 'B'){
                num[1]++;
            }
        }
        System.out.printf("a%dB%d",num[0],num[1]);
    }
}