// Lab01 - Atividade prática
// Programa para somar dois números inteiros de dois dígitos
// Adaptação do programa Addition.java (1999 by Deitel & Associates, Inc. and Prentice Hall)

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
         JOptionPane.showInputDialog( "Entre com o primeiro número inteiro" );

      secondNumber =
         JOptionPane.showInputDialog( "Entre com o segundo número inteiro" );

      number1 = Integer.parseInt( firstNumber );
      number2 = Integer.parseInt( secondNumber );

      sum = number1 + number2;

      JOptionPane.showMessageDialog(
         null, "A soma é " + sum, "Resultado",
         JOptionPane.PLAIN_MESSAGE );

      System.exit( 0 );
   }
}
