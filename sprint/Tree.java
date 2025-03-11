package sprint;

public class Tree {
    public static void tree(int height) {

        if (height <= 0) {
            return;
        }

        String start = "";
        String body ="";
        String trunk = "";

        //start
        for (int i = 1;i <height; i++){
            start+=" ";
        }
        start+="^\n";

        //body
        int branchSymbols;
        int spacing;
        for (int row = 1; row <= height; row++) {
            branchSymbols = 2 * row - 1;
            spacing = height - row;
            if (branchSymbols>1){
                for (int i = 0; i < spacing; i++){
                    body+=" ";
                }
                body+="/";
                for (int i = 0; i < branchSymbols - 2; i++){
                    body+="*";
                }
                body+="\\\n";
            }
            
        }

        //trunk
        int trunkHeight = Math.max(1, height / 3);
        int trunkWidth;

        if (height <= 3) {
            trunkWidth = 1;
        } else if (height <= 6) {
            trunkWidth = 3;
        } else if (height <= 9) {
            trunkWidth = 5;
        } else {
            trunkWidth = 7;
        }
        for (int h =0; h<trunkHeight;h++) {
            for (int i = 1; i < height-trunkWidth/2; i++){
                trunk+=" ";
            }
            for (int w = 0;w<trunkWidth;w++){
                trunk+="|";
            }
            trunk+="\n";
        }

        System.out.print(start);
        System.out.print(body);
        System.out.print(trunk);
    }
}
