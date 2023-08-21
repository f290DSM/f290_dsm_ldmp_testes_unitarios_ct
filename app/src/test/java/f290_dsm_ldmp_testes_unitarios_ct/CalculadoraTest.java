package f290_dsm_ldmp_testes_unitarios_ct;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes unitários da classe Calculadora.")
public class CalculadoraTest {

    private static Calculadora sut;

    @BeforeAll
    static void setUpAll() {
        sut = new Calculadora();
    }

    @BeforeEach
    void setUp() {
        //System.out.println("FeforeEach");
    }

    @AfterAll
    static void TearDownAll() {
        //System.out.println("AfterAll");
    }

    @AfterEach
    void tearDown() {
        //System.out.println("AfterEach");
    }

    @DisplayName("Deve retornar com sucesso as soma de 2 valores double.")
    @Test
    void deveRetornarSomaDeDoisValoresTest() {
        System.out.println("Soma");
        // Arrange
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

    @Test
    void deveRetornarADiferencaEntreDoisValores() {
        System.out.println("Diferenca");
        // Arrange
        Double x = 10D;
        Double y = 5D;
        Double resultadoEsperado = 5D;

        // Act
        Double soma = sut.diferenca(x, y);

        // Assert
        Assertions.assertDoesNotThrow(() -> sut.soma(x, y));
        Assertions.assertNotNull(soma);
        Assertions.assertEquals(resultadoEsperado, soma);
    }
}
