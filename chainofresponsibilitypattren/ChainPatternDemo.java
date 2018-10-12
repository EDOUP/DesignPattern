package chainofresponsibilitypattren;

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain=getChainOfLoggers();
        loggerChain.loginMessage(AbstractLogger.INFO,"This is an information");
        loggerChain.loginMessage(AbstractLogger.DEBUG,"This is an debug level information");
        loggerChain.loginMessage(AbstractLogger.ERROR,"This is an error information");
    }
}

