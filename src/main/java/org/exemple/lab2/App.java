package org.exemple.lab2;

import org.apache.commons.lang3.StringUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int a = 1452;
        int b = 567;
        int f = add(a,b);
        
        String cake = "gateau";
        if (StringUtils.isEmpty(cake)){
            System.out.println(cake);
        } else {
            System.out.println("pas " + cake);
        }
    }
    
    public static int add (int x, int y){
        return x + y;
    }
    
    
}
