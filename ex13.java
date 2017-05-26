package exa;

public class ex13{

	public static void main(String arg[])
    {
        try
        {
	         Exception e = new Exception("Este es mi propio error.");
	         throw e;
        }
        catch(Exception excepcion)
        {
	         excepcion.printStackTrace();
        }
        finally
        {
	         System.out.println("Se ejecuta finally");
        }
    }
}
