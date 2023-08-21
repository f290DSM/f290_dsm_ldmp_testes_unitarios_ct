package f290_dsm_ldmp_testes_unitarios_ct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes unitários da classe Calculadora.")
public class CalculadoraTest {

    @DisplayName("Deve retornar com sucesso as soma de 2 valores double.")
    @Test
    void deveRetornarSomaDeDoisValoresTest() {
        // Arrange
        Calculadora sut = new Calculadora();
        Double x = 10D;
        Double y = 10D;
        Double resultadoEsperado = 20D;

        // Act
        Double soma = sut.soma(x, y);

        // Assert
        Assertions.assertDoesNotThrow(() -> sut.soma(x, y));
        Assertions.assertNotNull(soma);
        Assertions.assertEquals(resultadoEsperado, soma);

    }
}
