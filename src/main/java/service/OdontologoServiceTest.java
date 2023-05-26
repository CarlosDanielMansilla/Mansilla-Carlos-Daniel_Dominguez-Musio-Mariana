package service;

import dao.impl.OdontologoDaoH2;
import entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OdontologoServiceTest {
    private final OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void deberiaListarTodosLosOdontologos(){
        List<Odontologo> odontologoTest = odontologoService.listarOdontologos();
        assertFalse(odontologoTest.isEmpty());
        assertTrue(odontologoTest.size() == 2);

    }
}


