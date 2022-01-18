package main.java.com.github.victorskg.single_responsability_principle.good;

public class MailService {

    public void sendMail(String content, String to) {
        // Lógica de envio de email.
        System.out.println("Email enviado para: " + to);
        System.out.println("Conteúdo: " + content);
    }

}
