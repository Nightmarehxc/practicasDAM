/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
public class media {

    

void media(float x, float y) 
    {
        float resultado = 0;

        if ((x < 0) || (y < 0)) 
        {
            System.out.println("X e Y deben ser positivos");
        }
    else 
        {  
            resultado = (x + y) / 2;
                System.out.println("la media es:  "+ resultado);
        }
    }
}
