package f290_dsm_ldmp_testes_unitarios_ct;

import java.util.List;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.*;

public class EstanteTest {

    private static Estante sut;

    @BeforeAll
    static void setUpAll() {
        sut = new Estante();
    }
    
    @DisplayName("Deve estar com a lista de livros vazia ao iniciar a Estante.")
    @Test
    void devePossuirListaVaziaAoIniciar() {
        List<Livro> livros = sut.livros();

        Assertions.assertTrue(livros.isEmpty());
    }
}
