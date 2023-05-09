public class pr1 {
    public static void main(String[] args) {
        String S = "abcdefg";
        int [] index = {7,6,9, 5, 4, 1, 3, 2};
        String newS= "";
        boolean check = true;
        for (int i = 0; i<(index.length); i++){
            if (index[i]<=S.length()){
                newS = newS + S.charAt(index[i]-1);
            }
            else {
                check =false;
            }
        }
        if(check) System.out.println(newS);
        else System.out.println("Неправильные индексы");

    }
}
