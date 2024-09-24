import config.MongoConfig;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MongoConfig.class)
public class CursoRepositoryTest {

    @Autowired
    private ICursoRepository cursoRepository;

    @Test
    public void cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE - Spring data e mongoDB");
        curso.setNome("Curso de Java Back-end");
        curso = cursoRepository.insert(curso);

        assertNotNull(curso);
    }


}
