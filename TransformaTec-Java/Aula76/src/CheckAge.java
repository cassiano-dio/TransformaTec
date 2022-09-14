public class CheckAge {
    
    public static void main(String[] args) {
        
        int[] ages = {20,30,45,12,18};

        System.out.println("Varrendo o vetor parando com uma determinada condição");
        for (int i = 0; i < ages.length; i++) {

            if(ages[i]< 18){
                //System.out.println("Menor encontrado na balada. Fim de festa.");
                break;
            }

            System.out.println(ages[i]);
        }

        System.out.println();
        System.out.println("Varrendo o vetor pulando uma execução com uma determinada condição");
        for (int i = 0; i < ages.length; i++) {

            if(ages[i] < 18){
                continue;
            }

            System.out.println(ages[i]);
        }

        System.out.println();
        System.out.println("Varrendo o vetor normalmente");
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

    }

}
