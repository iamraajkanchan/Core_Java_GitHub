package programs.logicsDemo;

public class Back_And_Forth_Pyramids_NIIT {
public static void main(String args[]){
    int i,j,k;
    
        for (i = 1; i < 6; i++)
        {
            for(k = 4; k > 0; k--){
                System.out.println(" ");
                    for(j = 1; j <= i; j++){
                        if(i != j){
                            System.out.println(i);
                        }
                        else{
                        i--;
                    
                }
            }
        }
    }
}  
}
