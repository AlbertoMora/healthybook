/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriasExternas;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PushbuttonField;
import controladores.ControladorDieta;
import controladores.ControladorRango;
import controladores.ControladorRutina;
import controladores.ControladorTurno;
import java.util.ArrayList;
import modelos.ModeloDieta;
import modelos.ModeloRango;
import modelos.ModeloRutina;
import modelos.ModeloTurno;

/**
 *
 * @author Alberto Mora
 */
public class PdfCreator {

    ModeloRango rango;
    ModeloDieta dieta;
    ModeloRutina rutina;
    ArrayList<ModeloTurno> turnos = new ArrayList();

    public boolean writePDF(double imc) throws IOException, FileNotFoundException, DocumentException {
        initData(imc);
        if (rango != null && dieta != null && rutina != null /*&& turnos.size() != 0*/) {
            PdfReader template = new PdfReader(System.getProperty("user.dir") + "/resources/pdfTemplate.pdf");
            FileOutputStream fileos = new FileOutputStream(System.getProperty("user.dir") + "\\resources\\test.pdf");
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            PdfStamper stamper = new PdfStamper(template, fileos);
            stamper.setFormFlattening(true);
            AcroFields form = stamper.getAcroFields();
            PushbuttonField img = form.getNewPushbuttonFromField("imgDieta");
            img.setLayout(PushbuttonField.LAYOUT_ICON_ONLY);
            img.setProportionalIcon(true);
            img.setImage(Image.getInstance("https://i.ibb.co/g9XGPMx/prueba.jpg"));
            form.replacePushbuttonField("imgDieta", img.getField());
            stamper.getAcroFields().setField("txtNombreDiet", dieta.getNombre());
            stamper.getAcroFields().setField("txtDescDieta", dieta.getDescripcion());
            stamper.getAcroFields().setField("txtCalorias", Integer.toString(dieta.getCaloriasRed()));
            stamper.getAcroFields().setField("txtNombreRutina", rutina.getNombre());
            stamper.getAcroFields().setField("txtDescripRutina", rutina.getDescripcion());
            stamper.getAcroFields().setField("txtTiempoRutina", Double.toString(rutina.getDuracion()));
            stamper.getAcroFields().setField("txtUrlRutina", rutina.getUrl());
            stamper.close();
            template.close();
            return true;
        }else{
            return false;
        }
    }

    private void initData(double imc) {
        ControladorRango conRango = new ControladorRango();
        try {
            rango = conRango.obtenerIdRango(imc);
            ControladorDieta conDieta = new ControladorDieta();
            ControladorRutina conRutina = new ControladorRutina();
            ControladorTurno conTurnos = new ControladorTurno();
            dieta = conDieta.obtenerDietaPorRango(rango.getId());
            rutina = conRutina.obtenerRutinaPorRango(rango.getId());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
