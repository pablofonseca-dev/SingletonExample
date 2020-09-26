public class Logger {

    private static Logger log;
    private String value;

    public void setValue(String msg){
        this.value = msg;
    }

    public String getValue(){
        return this.value;
    }

    private Logger(){

    }

    public static synchronized Logger getInstance(){
        if(log == null){
            log = new Logger();
        }
        return log;
    }

    public void log(String msg){
        if(msg.equals(null)){
            throw new NullPointerException();
        }else{
            System.out.println(msg);
        }
    }
}
