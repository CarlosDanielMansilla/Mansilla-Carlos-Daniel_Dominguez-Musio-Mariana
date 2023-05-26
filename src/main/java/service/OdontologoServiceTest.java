package service;

import dao.impl.OdontologoDaoH2;
import entity.Odontologo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class    OdontologoServiceTest {
    private final OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void deberiaAgregarOdontologo(){
        Odontologo pacTest = new Odontologo(1235,"Mile", "Mansilla");

        Odontologo odontologoResult = odontologoService.guardarOdontologo(pacTest);

        assertNotNull(odontologoResult);

    }
    @Test
    public void deberiaListarTodosLosOdontologos(){
        List<Odontologo> odontologoTest = odontologoService.listarOdontologos();
        assertFalse(odontologoTest.isEmpty());
        assertTrue(odontologoTest.size() >= 2);

    }
}


