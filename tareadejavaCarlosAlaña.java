
package javaapplication3;

import javax.swing.JOptionPane;

public class tareadejavaCarlosAlaña {

    public static void main (String[] args){
    final int saldoinicial = 1000;
    int opcion ;
    float ingreso , saldoactual , retiro;
    opcion =Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la banca MR.Charlee que desea hacer  \n"
    + "1. depositar dinero en la cuenta\n"
            +"2. retirar dinero \n"
            +"3. exit" ));
    switch (opcion){
        case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Insertar dinero"));
        saldoactual = saldoinicial + ingreso ;

        JOptionPane.showMessageDialog(null,"Dinero de la cuenta: "+ saldoactual+ " Dolares");
        break;
        case 2 : retiro = Float.parseFloat(JOptionPane.showInputDialog("insertar el valor a retirar "));

        if (retiro>saldoinicial) {
            JOptionPane.showMessageDialog(null," ¡No hay dinero!  ");

        }
        else {
            saldoactual = saldoinicial - retiro ;
            JOptionPane.showMessageDialog(null,"Dinero de tu cuenta es: "+ saldoactual + " Dolares");
        }
        break;
        case 3: break;
        default: JOptionPane.showMessageDialog(null,"No tiene cuenta ");break ;
    }

        }
}
