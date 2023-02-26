import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> impar = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> valores = new ArrayList<Integer>();

            valores.add(2359);
            valores.add(1480);
            valores.add(1860);

            System.out.println("\nSalários de todos os funcionários antes dos aumentos: \n");
                System.out.println(valores);

            //map & filter
            System.out.println("\nSalários de todos os funcionários após aumento experimental: \n");
            valores.forEach((v)->{
                dobro.add(v*2);
                if(v%2 == 0){
                    par.add(v*2);
                }else{
                    impar.add(v);
                }
            });
                System.out.println(dobro);
            System.out.println("\nSalário dos funcionários após aumento: \n");
                System.out.println(par);
            System.out.println("\nSalários dos funcionários que não receberam aumento: \n");
                System.out.println(impar);
            
           //reduce
           int media = par.stream().reduce(0, Integer::sum) / par.size();
                System.out.println("\nMédia Aritmética salárial: "+ media+"\n"+"\nNovo valor total que a empresa pagará em salários: "+ par.stream().reduce(0, Integer::sum));
                System.out.println("\n");
           
    }
}
/*
    PROBLEMA: 
    Em uma empresa acontecerá um aumento no salário de seus funcionários, entretando,
    apenas funcionario com salários PAR poderão receber esse aumento, deve-se então:
    - apesentar o salário de todos funcionários antes da mudança. 
    - dobrar seus salários para um aumento experimental. -> map
    - identificar os pares e os impares e aplicar devidamento o aumento. -> filter
    - depois deve ser dado, já com os novos valores, a média aritmética salárial de quem teve salário aumentado. -> reduce
    - por último, deve ser informado o valor total que a empresa pagará em novos salários, porém, apenas nos PARES.
 */