
package exemploexcepcion;


public class Division {

    public Division() {
    }
    
    public void dividir(int nume, int deno){
        System.out.println("solución = "+nume/deno);
       // System.out.println("despois da excepción");
    }
    public void dividirConTryCatch(int nume, int deno){
        int resul=0;
        try{
            System.out.println(nume/deno);
            System.out.println("despois da excepción");
        }catch(ArithmeticException ex){
            System.out.println("Error 1: "+ex.toString()); 
        }catch(Exception e){
            System.out.println("Error 2: "+e.getMessage());
        }
        finally{
        
            System.out.println("Este bloque executase sempre");
        }
        }
        public void dividirLanzanExcep(int nume, int deno) throws ArithmeticException{
        
            if(deno==0)
                throw new ArithmeticException("non divididas entre 0");
            System.out.println("Solución: "+nume/deno);
           
        
    }
        public void dividirexcepcion(int nume,int deno)throws Excepcion{
           if(deno==0)
               throw new Excepcion();
           else
                System.out.println("Resultado: "+nume/deno);
        }
        
}
