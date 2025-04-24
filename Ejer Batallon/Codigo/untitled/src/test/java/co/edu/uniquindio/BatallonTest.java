package co.edu.uniquindio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class BatallonTest {
    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());


    @Test
    public void testsoldadosDisponiblesRango() {
        Batallon batallonTest = new Batallon ("8 Brigada");
        ArrayList<Soldado> listSoldados = new ArrayList<>();

        Soldado soldado1 = new Soldado ("101", "Luis", "Cabo", Especialidad.MEDICO, 35, true);
        Soldado soldado2 = new Soldado ("102", "Juan", "Teniente", Especialidad.LOGISTICA, 32, true);
        Soldado soldado3 = new Soldado ("102", "Juan", "Teniente", Especialidad.LOGISTICA, 32, true);
        listSoldados.add(soldado1);
        listSoldados.add(soldado2);
        listSoldados.add(soldado3);

        batallonTest.setListSoldados(listSoldados);

        ArrayList result = batallonTest.soldadosDisponiblesRango(true, Especialidad.MEDICO);
        assertEquals(1, result.size());
        assertEquals(soldado1, result.get(0));



    }


    @Test
    @DisplayName("Registro de Misiones Batallon")
    public void registrarMisionTest(){
        Batallon batallonTest = new Batallon("Cacique Calarca");

        ArrayList<String> listPersonal = new ArrayList<>();
        listPersonal.add("Carlos");
        listPersonal.add("Tomas");
        listPersonal.add("Juan");

        Blindado newVehiculoBlindado = new Blindado("10","2000", "1999", 1000, EstadoOperativo.DISPONIBLE, "10");
        ArrayList listTempo = batallonTest.getListVehiculosBlindados();
        listTempo.add(newVehiculoBlindado);
        batallonTest.setListVehiculos(listTempo);

        boolean result = batallonTest.registrarMision(LocalDate.of(2025,8,4),
                "Genova", listPersonal,"10");

        assertTrue(result);
    }

}