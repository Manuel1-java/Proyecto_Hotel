package Controlador;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ticket {
    public void generatePDF(String dest) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();
            document.add(new Paragraph("This is a sample PDF document created using iText."));
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.generatePDF("sample_ticket.pdf");
    }
}