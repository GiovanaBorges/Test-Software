// Lab01 - Atividade pr�tica
// Programa para somar dois n�meros inteiros de dois d�gitos
// Adapta��o do programa Addition.java (1999 by Deitel & Associates, Inc. and Prentice Hall)

import javax.swing.JOptionPane;

public class Lab01 {
   public static void main( String args[] )
   {
      String firstNumber,
             secondNumber;
      int number1,
          number2,
          sum;

       firstNumber =
         JOptionPane.showInputDialog( "Entre com o primeiro n�mero inteiro" );

      secondNumber =
         JOptionPane.showInputDialog( "Entre com o segundo n�mero inteiro" );

      number1 = Integer.parseInt( firstNumber );
      number2 = Integer.parseInt( secondNumber );

      sum = number1 + number2;

      JOptionPane.showMessageDialog(
         null, "A soma � " + sum, "Resultado",
         JOptionPane.PLAIN_MESSAGE );

      System.exit( 0 );
   }
}
