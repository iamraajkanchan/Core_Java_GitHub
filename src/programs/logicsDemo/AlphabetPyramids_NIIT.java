package programs.logicsDemo;


public class AlphabetPyramids_NIIT {
    public static void main(String args[]){
        int i,j;
        char c;
        for(i = 65; i < 70; i++){
            for(j = 65; j <= i; j++){
                c = (char)i;
                System.out.print(c);
            }
            System.out.println("");
        }
    }
 
}
