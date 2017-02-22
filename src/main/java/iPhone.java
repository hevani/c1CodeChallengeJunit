public class iPhone
{
	private String decaf;
	private String shots;
	private String milk;
	private String drink;
    public iPhone( ) { }

    public void setDecaf(String s)
    {
        // input: NO, YES and 1/2
    	decaf = "Decaf["+s+"]" ;
        
    }
    
    public void setShots(String s)
    {
        // input: 1, 2, 3, d
    	shots = "Shots["+s+"]" ;;
    }

    public void setMilk(String s)
    {
        // input: WH, NF, 1, 2
    	milk = "Milk["+s+"]" ;;
    }
    
    public void setDrink(String s)
    {
        // input: A, L, M, C, CM, CDI, E, ECP
    	drink = "Drink["+s+"]" ;;
    }
    
    public String sendCommand()
    {
        // return command string for robot
        
        //return "Robot: Decaf["+decaf+"] Shots["+shots+"] Milk["+milk+"] Drink["+drink+"]" ; // replace with your code
    	
    	String result = "";
    	if(decaf != null)
    		result = decaf + " "; 
    	result = result + shots  + " " + milk + " " + drink; 
    	return "Robot: " + result; // replace with your code
    }
}
