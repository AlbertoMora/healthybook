/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriasExternas;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Alberto Mora
 */
public class Correo {

    String adjunto = System.getProperty("user.dir") + "\\resources\\test.pdf";

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the destinatario
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    private String mensaje;
    private String destinatario;
    private String asunto;
    private final String remitente = "progra12018@gmail.com";
    private final String password = "Progra123456789";
    private final String servidorCorreo = "smtp.gmail.com";
    private final String puertoServidor = "587";

    public Correo() {
    }

    public Correo(String mensaje, String destinatario, String asunto) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.asunto = asunto;
    }

    public boolean enviarCorreo() {

        String to = this.getDestinatario();
        //"smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", this.servidorCorreo);
        properties.put("mail.smtp.user", this.remitente);
        properties.put("mail.smtp.password", this.password);
        properties.put("mail.smtp.port", this.puertoServidor);
        properties.put("mail.smtp.auth", "true");
        DataSource source = new FileDataSource(adjunto);
        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(this.remitente));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(this.getAsunto());

            // Now set the actual message
            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setText(this.getMensaje());

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("Healthy Tips.pdf");
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(this.servidorCorreo, this.remitente, this.password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            //System.out.println("Sent message successfully....");
            return true;
        } catch (MessagingException mex) {
            mex.printStackTrace();
            return false;
        }

    }

}
