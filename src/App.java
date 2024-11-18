import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[][] tablero = new String[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = " -- ";
            }
        }
        //CABALLOS NEGROS
        tablero[7][1] = " cb ";
        tablero[7][6] = " cb ";
        //CABALLOS BLANCOS
        tablero[0][1] = " cn ";
        tablero[0][6] = " cn ";

        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i])); 
        }
    }

}
