
public class pr21 {

    public static void main(String[] args) {

        //int NStr = 2;
        int MIng = 3;


        String text = "Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое. \n"
        + "Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";
        String ing = "арахис - колбаса\n"
        + "клубника - вишня\n"
        + "сгущенка - молоко";

        
        
        ing = ing.replace("\n", " - ");

        String []ingNew = ing.split (" - ");
        String []ingNewUpperCase = new String [MIng*2];

        for (int i =0; i<MIng*2; i++){
            
            ingNewUpperCase[i] = ingNew[i].substring(0, 1).toUpperCase() + ingNew[i].substring(1);
            
        }

        for (int i =0; i<MIng*2; i+=2){
            text = text.replace(ingNew[i], ingNew[i+1]);
            text = text.replace(ingNewUpperCase[i], ingNewUpperCase[i+1]);
            
        }

            System.out.println(text);
    }

}