package demoException;

public class DemoException {
    public static void main(String[] args) {

        Compte compte = new Compte("123");
        try{
            compte.depot(100);
            System.out.println("Depot Réussi");
            compte.retrait(1000);
            System.out.println("Retrait Réussi");
        } catch (SoldeInsufisantException e){
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch ( RuntimeException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Finito!!!");

        System.out.println(1/0);
    }
}
