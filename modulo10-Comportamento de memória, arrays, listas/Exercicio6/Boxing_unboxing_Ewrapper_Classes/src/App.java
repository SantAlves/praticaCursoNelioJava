public class App {
    public static void main(String[] args) throws Exception {
        
        
        String [] vect = new String[]{"Ana", "Brian", "Carol", "Davi", "Elena"};
        
        System.out.println("APrimeira opção");
        
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("////////////////////////////////");

        System.out.println("Segunda opção");

        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
