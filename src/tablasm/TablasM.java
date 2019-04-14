
package tablasm;

public class TablasM {

    public static void main(String[] args) {
int i,j,resultado=0;
        for(i=1;i<11;i++){
            System.out.println("La tabla de multiplicar "+i+" es: ");
            for (j=1;j<11;j++){
           resultado = i*j;
           System.out.print("\t"+i+" * "+j+" = " +resultado+" ");
           if (resultado%2==0){
                System.out.println("PAR");
            }else
                    System.out.println("IMPAR");
            
             }

        }    
        }
    }
    

