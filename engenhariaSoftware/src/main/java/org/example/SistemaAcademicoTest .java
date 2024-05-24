package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaAcademicoTest {
    private SistemaAcademico sistema;

    @BeforeEach
    public void setUp() {
        sistema = new SistemaAcademico();
    }

    @Test
    public void testCadastrarAluno() {
        sistema.cadastrarAluno("João");
        assertNotNull(sistema.buscarAluno("João"));
    }

    @Test
    public void testCadastrarMateria() {
        sistema.cadastrarMateria("Matemática");
        assertNotNull(sistema.buscarMateria("Matemática"));
    }

    @Test
    public void testAtribuirNota() {
        sistema.cadastrarAluno("João");
        sistema.cadastrarMateria("Matemática");
        sistema.atribuirNota("João", "Matemática", 8.5);
        Aluno joao = sistema.buscarAluno("João");
        assertEquals(8.5, joao.getNotas().get(0).getValor());
    }

    @Test
    public void testAtribuirNotaDuplicada() {
        sistema.cadastrarAluno("João");
        sistema.cadastrarMateria("Matemática");
        sistema.atribuirNota("João", "Matemática", 8.5);
        assertThrows(IllegalArgumentException.class, () -> {
            sistema.atribuirNota("João", "Matemática", 9.0);
        });
    }

    @Test
    public void testListarAlunosComNotas() {
        sistema.cadastrarAluno("João");
        sistema.cadastrarMateria("Matemática");
        sistema.atribuirNota("João", "Matemática", 8.5);
        sistema.listarAlunosComNotas();
    }

    @Test
    public void testListarAlunosSemNotas() {
        sistema.cadastrarAluno("João");
        sistema.listarAlunosComNotas();
    }

    @Test
    public void testListarMaterias() {
        sistema.cadastrarMateria("Matemática");
        sistema.cadastrarMateria("Português");
        sistema.listarMaterias();
    }

    @Test
    public void testListarAlunos() {
        sistema.cadastrarAluno("João");
        sistema.listarAlunos();
    }
}
