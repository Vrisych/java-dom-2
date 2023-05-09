import java.util.Scanner;
//замена в рецепте. вводимый русский текст превращается в белиберду
public class pr2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in, "UTF-8");
        System.out.println("Введите кол-во строк");
        String NStrS = read.nextLine();
        int NStr = Integer.parseInt(NStrS);
        System.out.println("Введите кол-во строк замены");
        String MIngS = read.nextLine();
        int MIng = Integer.parseInt(MIngS);


        String [] text = new String [NStr];
        String [] ing = new String [MIng];
        System.out.println("Строка");

        for (int i=0; i<NStr; i++){
            
            text [i] = read.nextLine();
        }
        System.out.println("Замена");

        String ingredients = "";
        for (int i=0; i<MIng; i++){

            ing [i] = read.nextLine();
            ingredients = ingredients +  ing[i] + "\n";

        }
        read.close();
        ingredients = ingredients.replace("\n", " - ");
        

        String []ingNew = ingredients.split (" - ");
        String []ingNewUpperCase = new String [MIng*2];

        for (int i =0; i<MIng*2; i++){
            
            ingNewUpperCase[i] = ingNew[i].substring(0, 1).toUpperCase() + ingNew[i].substring(1);
            
        }

        for (int i =0; i<MIng*2; i+=2){
            for (int p = 0; p<NStr; p++){
            text [p] = text[p].replace(ingNew[i], ingNew[i+1]);
            text [p] = text[p].replace(ingNewUpperCase[i], ingNewUpperCase[i+1]);
            }
        }
        for (int i =0; i<NStr; i++){
        
            System.out.println(text [i]);
        }
        
    }
}
