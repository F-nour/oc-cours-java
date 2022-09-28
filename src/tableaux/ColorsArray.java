package tableaux;

import java.util.ArrayList;

public class ColorsArray {
	
    public static void main(String[] args){  
        String[] colors = new String[5];

        colors[0] = "red";
        colors[1] = "yellow";
        colors[2] = "orange";
        colors[3] = "green";
        colors[4] = "blue";

     
        colors[3] = "emerald";
      
        for(String color:colors){
            System.out.println(color);
        } 
    }
    
}
