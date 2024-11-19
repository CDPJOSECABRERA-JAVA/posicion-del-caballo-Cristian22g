import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[][] tablero = new String[8][8];
        String[] columnas = {"a","b","c","d","e","f","g","h"};
        int[][] movimientos = {
                                {-2,1}, {-2,-1}, //ARRIBA 2 DER, ARRIBA 2 IZQ
                                {-1,2}, {-1,-2}, // ARRIBA 1 DER, ARRIBA 1 IZQ
                                {2,1},{2,-1}, // ABAJO 2 DER, ABAJO 2 IZQ
                                {1,2}, {1,-2} // ABAJO 1 DER, ABAJO 1 IZQ 
                            };

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = " -- ";
            }
        }
        //CABALLO NEGRO
        tablero[7][1] = " cb ";

        for (int i = 0; i < movimientos.length; i++) {
        /* 
            if (7+(movimientos[i][0]) < tablero[0].length -1 
            && 1+(movimientos[i][1]) < tablero[0].length -1 
            && 7+(movimientos[i][0]) >= 0 
            &&  1+(movimientos[i][1]) >= 0)                                 
            {
                tablero[7+(movimientos[i][0])][1+(movimientos[i][1])] = " xx ";
            }
        */
            try {
                tablero[7+(movimientos[i][0])][1+(movimientos[i][1])] = " xx ";
            } catch (IndexOutOfBoundsException e) {
            }
        }
        tableroToString(tablero);
    
    
    
    
    }

    public static void tableroToString(String[][] tablero){
        for (int i = tablero.length-1; i >0; i--) {
            System.out.println(Arrays.toString(tablero[i]));
        }
        return;
    }
}
