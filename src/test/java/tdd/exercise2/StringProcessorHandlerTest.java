package tdd.exercise2;

import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.security.InvalidParameterException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.Mockito.*;

class StringProcessorHandlerTest {

    // HOJA DE RUTA
    // 1 Probar que al ejecutar pipeline se retorne la misma entrada
    // 2 Probar que al recibir como entrada null retorne una excepción
    // 3 Probar que al agregar un procesador se retorne el handler
    // 4 Probar que al ejecutar el pipeline se invoque un procesador y reciba la entrada del pipeline
    // 5 Probar que al ejecutar el pipeline se invoque 2 procesadores
    // 6 Probar que el segundo procesador reciba la salida del primero
    // 7 Probar que la salida del pipeline sea la salida del último procesador

    /* SOLUCION
    EasyRandom random = new EasyRandom();

    @Test
    void returnSameInput() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();
        String input = random.nextObject(String.class);

        String output = stringProcessorHandler.execute(input);

        assertThat(output).isEqualTo(input);
    }

    @Test
    void throwsExceptionWhenInputIsNull() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();

        Throwable throwable = catchThrowable(() -> stringProcessorHandler.execute(null));

        assertThat(throwable).hasMessage("Null input isn't allowed");
        assertThat(throwable).isInstanceOf(InvalidParameterException.class);
    }

    @Test
    void returnSameProcessorHandlerWhenAddNew() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();

        StringProcessorHandler output = stringProcessorHandler.add(mock(StringProcessor.class));

        assertThat(output).isSameAs(stringProcessorHandler);
    }

    @Test
    void invokeOneProcessorWhenExecutePipeline() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();
        StringProcessor stringProcessor = mock(StringProcessor.class);
        String input = random.nextObject(String.class);

        stringProcessorHandler.add(stringProcessor).execute(input);

        verify(stringProcessor).execute(input);
    }

    @Test
    void invokeTwoProcessorWhenExecutePipeline() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();
        StringProcessor firstProcessor = mock(StringProcessor.class);
        StringProcessor secondProcessor = mock(StringProcessor.class);

        stringProcessorHandler
                .add(firstProcessor)
                .add(secondProcessor)
                .execute(new String());

        InOrder inOrder = inOrder(firstProcessor, secondProcessor);
        inOrder.verify(firstProcessor).execute(any());
        inOrder.verify(secondProcessor).execute(any());
    }

    @Test
    void secondProcessorReceiveOutputFromFirst() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();
        StringProcessor firstProcessor = mock(StringProcessor.class);
        StringProcessor secondProcessor = mock(StringProcessor.class);
        String firstProcessorOutput = random.nextObject(String.class);
        when(firstProcessor.execute(anyString())).thenReturn(firstProcessorOutput);

        stringProcessorHandler.add(firstProcessor)
                .add(secondProcessor)
                .execute(new String());

        verify(secondProcessor).execute(firstProcessorOutput);
    }

    @Test
    void returnLastOutput() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();
        StringProcessor lastProcessor = mock(StringProcessor.class);
        String expectedValue = random.nextObject(String.class);
        when(lastProcessor.execute(any())).thenReturn(expectedValue);

        String output = stringProcessorHandler
                .add(mock(StringProcessor.class))
                .add(mock(StringProcessor.class))
                .add(lastProcessor)
                .execute(new String());

        assertThat(output).isEqualTo(expectedValue);
    }
    */


}