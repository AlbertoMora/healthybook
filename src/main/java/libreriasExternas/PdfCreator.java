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
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PushbuttonField;
import controladores.ControladorDieta;
import controladores.ControladorRango;
import controladores.ControladorRutina;
import controladores.ControladorTurno;
import java.awt.Desktop;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    ArrayList<ModeloTurno> turnos;
    final String templateUrl = System.getProperty("user.dir") + "/resources/pdfTemplate.pdf";
    final String destino = System.getProperty("user.dir") + "\\resources\\test.pdf";
    
    public boolean writePDF(double imc) throws IOException, FileNotFoundException, DocumentException {
        initData(imc);
        deleteFile();
        if (rango != null && dieta != null && rutina != null && !turnos.isEmpty()) {
            PdfReader template = new PdfReader(templateUrl);
            FileOutputStream fileos = new FileOutputStream(destino);
            PdfStamper stamper = new PdfStamper(template, fileos);
            stamper.setFormFlattening(true);
            AcroFields form = stamper.getAcroFields();
            form.removeXfa();
            textfieldStyle(form, "txtNombreDiet", "arialbd", 26f);
            setImageInPdf(form, "imgDieta", dieta.getUriImagen());
            setImageInPdf(form, "imgRutina", rutina.getUriImagen());
            stamper.getAcroFields().setField("txtNombreDiet", dieta.getNombre());
            stamper.getAcroFields().setField("txtDescDieta", dieta.getDescripcion());
            stamper.getAcroFields().setField("txtCalorias", Integer.toString(dieta.getCaloriasRed()));
            stamper.getAcroFields().setField("txtNombreRutina", rutina.getNombre());
            stamper.getAcroFields().setField("txtDescripRutina", rutina.getDescripcion());
            stamper.getAcroFields().setField("txtTiempoRutina", Double.toString(rutina.getDuracion()));
            stamper.getAcroFields().setField("txtUrlRutina", rutina.getUrl());
            for (int c = 0; c < turnos.size(); c++) {
                int i = c + 1;
                stamper.getAcroFields().setField("txtHarina" + i, Integer.toString(turnos.get(c).getcHarinas()));
                stamper.getAcroFields().setField("txtVeg" + i, Integer.toString(turnos.get(c).getcVegetales()));
                stamper.getAcroFields().setField("txtLact" + i, Integer.toString(turnos.get(c).getcLacteos()));
                stamper.getAcroFields().setField("txtCarne" + i, Integer.toString(turnos.get(c).getcCarne()));
                stamper.getAcroFields().setField("txtFrutas" + i, Integer.toString(turnos.get(c).getcFrutas()));
                stamper.getAcroFields().setField("txtGrasas" + i, Integer.toString(turnos.get(c).getcGrasas()));
            }
            stamper.close();
            template.close();
            return true;
        } else {
            return false;
        }
    }

    private void setImageInPdf(AcroFields form, String field, String URL) throws DocumentException, IOException {
        PushbuttonField img = form.getNewPushbuttonFromField(field);
        img.setLayout(PushbuttonField.LAYOUT_ICON_ONLY);
        img.setProportionalIcon(true);
        img.setImage(Image.getInstance(URL));
        form.replacePushbuttonField(field, img.getField());
    }

    private void textfieldStyle(AcroFields form, String field, String fuente, float fSize) throws DocumentException, IOException {
        BaseFont base = BaseFont.createFont("c:/windows/fonts/" + fuente + ".ttf", BaseFont.WINANSI, false);
        form.setFieldProperty(field, "textfont", base, null);
        form.setFieldProperty(field, "textsize", fSize, null);
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
            turnos = conTurnos.obtenerTurnosDieta(dieta.getId());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void openFile() {
        try {
            File file = new File(destino);
            Desktop.getDesktop().open(file);
        } catch (Exception e) {

        }
    }
    private void deleteFile(){
        File file = new File(destino);
        if(file.delete()){
            System.out.println(destino + " File deleted");
        }else System.out.println(destino + " doesn't exists");
    }
}
