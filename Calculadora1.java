//programa que le a opção de operação, os valores, executa a operação
//desejada e exibe o resultado
import javax.swing.JOptionPane;
public class Calculadora1{
   static char menu() { //o método está associado à classe
      char op;
      do {
         op = JOptionPane.showInputDialog(
         "Digite sua opcao:\n+ - soma\n- - subtracao\n* - multiplicacao\n/ - divisao\ns - sair").charAt(0);
      } while (op != '+' && op != '-' && op != '*' && op != '/' && op != 's' && op != 'S');
      return op;
    }
    static int soma (int n1, int n2) {
        return n1 + n2;
    }
    static  int sub(int n1,int n2){
        return(n1-n2);
    }
    static  int mult(int n1,int n2){
        return(n1*n2);
    }
    static  int div(int n1,int n2){
        return(n1/n2);
    }
   public static void main (String[] args) {
      char opcao;
      opcao = menu();
      while (opcao != 's' && opcao != 'S'){
         //leitura dos valores
         int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
         int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
         //processamento
         switch (opcao) {
            case '+':{
               int s = soma (num1, num2);
               JOptionPane.showMessageDialog(null, "soma = " + s);
               break;
            }
            case '-':{
                int s= sub(num1,num2);
                JOptionPane.showMessageDialog(null,"subtração   = "+ s);
                break;
            }
            case '*':{
                int s= mult(num1,num2);
                JOptionPane.showMessageDialog(null,"multiplicação = "+ s);
                break;
                }
            case '/':{
                int s= div(num1,num2);
                JOptionPane.showMessageDialog(null,"divisão = "+ s);
                break;
            }
         }
         opcao = menu();
      }  
      JOptionPane.showMessageDialog(null, "Obrigada. Volte Sempre!");
   }
}