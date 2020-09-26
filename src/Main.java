import java.io.*;

public class Main {


    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args){

        Logger myLogger = Logger.getInstance();
        Logger myLoggerTwo = Logger.getInstance();

        myLogger.setValue("Roar");

        out.println(myLoggerTwo.getValue());
    }

    public static void testLogMethod(Logger myLogger){
        try{
            out.print("Escriba un texto\n>>> ");
            String userInput = in.readLine();
            myLogger.log(userInput);
        }catch(NullPointerException nullPointerE){
            out.println("El valor ingresado es nulo");
        }catch(IOException ioE){
            out.println("Error en la obtención de los datos");
        }
    }

}
