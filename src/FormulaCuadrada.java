import javax.swing.*;

public class FormulaCuadrada {


    public static void main(String args[]){
        double a =0;
        double b =0;
        double c =0;
        double X1 =0;
        double X2 =0;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite un segundo numero"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite un ultimo numero"));
        double formula = (Math.pow(b,2)-4*a*c);
        X1 = (-b+Math.sqrt(formula))/(2*a);
        X2 = (-b-Math.sqrt(formula))/(2*a);

        if(formula<0){
            JOptionPane.showMessageDialog(null,"El resultado tiene infinitas soluciones");
        }else {
            JOptionPane.showMessageDialog(null, "El resultado de X1 es:  " + X1);
            JOptionPane.showMessageDialog(null, "El resultado de X2 es:  " + X2);
        }


    }
}
