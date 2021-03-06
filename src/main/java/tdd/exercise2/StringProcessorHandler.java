package tdd.exercise2;

import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase principal que controla el pipeline. Primero agrega todos los Stage con
 * add, luego ejecuta en orden (como fueron agregados) los Stage con execute. La
 * salida de un Stage es la entrada del siguiente.
 */
public class StringProcessorHandler {

    /* SOLUCION
    private List<StringProcessor> stringProcessors;

    public StringProcessorHandler() {
        this.stringProcessors = new LinkedList<>();
    }

    public StringProcessorHandler add(StringProcessor stringProcessor) {
        stringProcessors.add(stringProcessor);
        return this;
    }

    public String execute(String stringToProcess) {
        if(stringToProcess==null){
            throw new InvalidParameterException("Null input isn't allowed");
        }

        for (StringProcessor stringProcessor : stringProcessors) {
            stringToProcess = stringProcessor.execute(stringToProcess);
        }
        return stringToProcess;
    }
    */


}
