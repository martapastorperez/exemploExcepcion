
package exemploexcepcion;

public class ExemploExcepcion {

    
    public static void main(String[] args) {
    
        Division div=new Division();
        //div.dividir(6, 2);
        //div.dividir(5, 0);
        //div.dividirConTryCatch(4, 0);
        //div.dividirConTryCatch(4,0);
        //div.dividirLanzanExcep(10, 0);
        try{
            div.dividirexcepcion(8, 0);
            
        }catch(Excepcion e){
            System.out.println(e.toString());
        }
        System.out.println("******");
    }
    
}
