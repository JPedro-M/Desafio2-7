package desafio2.pkg7;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio27 {

    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        Scanner ler = new Scanner(System.in);
        int x1, x2, y1, y2;
        double d;
        
        System.out.println("qual o x1 do primeiro ponto?");
        x1 = ler.nextInt();
        System.out.println("qual o x2 do primeiro ponto?");
        x2 = ler.nextInt();
        System.out.println("qual o y1 do segundo ponto?");
        y1 = ler.nextInt();
        System.out.println("qual o y2 do segundo ponto?");
        y2 = ler.nextInt();
        
        d = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        
        System.out.println("A distancaia entre os dois pontos é:"+formato.format(d));
    }
}
