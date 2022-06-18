import javax.swing.*;

public class condicionales {



    public static void main(String args[]){
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Por faovr ingrese su edad"));

            if(edad>=18){
                JOptionPane.showMessageDialog(null,"Usted es mayor de edad");

            }else{

                JOptionPane.showMessageDialog(null, "Usted es menor de edad");

            }

        }



    }


