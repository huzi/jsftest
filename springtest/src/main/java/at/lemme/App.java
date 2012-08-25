package at.lemme;

import javax.faces.bean.ManagedBean;

/**
 * Hello world!
 *
 */
@ManagedBean(name="helloBean")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    private String value;  
    
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
    
    public String getHello(){
    	return "hello 123";
    }
}
