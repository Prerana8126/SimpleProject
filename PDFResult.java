import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Phrase;/**
/**
* This class is used to create a pdf file using iText jar.
* @author w3spoint
*/
public class PDFResult{
public static void main(String args[]){
try {
//Create Document instance.
Document document = new Document(PageSize.A4);

//Create OutputStream instance;
OutputStream outputStream =new FileOutputStream(new File("G:\\REPORT_CARD.pdf"));

//Create PDFWriter instance.
GenerateQRCode1 qr=new GenerateQRCode1();

PdfWriter pdfWriter = PdfWriter.getInstance(document, outputStream);
 
                  String userPassword = qr.genreatePassword();
                  String ownerPassword = "1234";
 
                  pdfWriter.setEncryption(userPassword.getBytes(),
                               ownerPassword.getBytes(), PdfWriter.ALLOW_PRINTING,
                               PdfWriter.ENCRYPTION_AES_128);

//Open the document.
document.open(); 
 //Create Image object
        Image image2 = Image.getInstance("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\prerana.jpg");
        Image image1 = Image.getInstance("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\RBS .jpg");

		image1.scaleAbsolute(67f,67.0f);
		image1.setAbsolutePosition(25f,750f);
		image2.scaleAbsolute(68f,60.5f);
		image2.setAbsolutePosition(436f,592f);
 
 
        //Add content to the document using Image object.
        document.add(image1);
        document.add(image2);
 
//Create Paragraph objects

Paragraph paragraph1 = new Paragraph("Dr.Bhimrao");
Paragraph paragraph2 = new Paragraph("Ambedkar");
Paragraph paragraph3 = new Paragraph("Unversity,Agra");
Paragraph paragraph4 = new Paragraph("EXAMINATION HELD IN");
Paragraph paragraph5 = new Paragraph("APRIL-2023");
Paragraph paragraph6 = new Paragraph("STATEMENT OF MARKS");
Paragraph paragraph7 = new Paragraph("COURSE NAME        :BACHELOR OF COMPUTER APPLICATION");
Paragraph paragraph8 = new Paragraph("SEMESTER               :I");
Paragraph paragraph9 = new Paragraph("ROLL NO                   :2200025010005 ");
Paragraph paragraph10 = new Paragraph("ENROLLMENT NO.   :A-22191608");
Paragraph paragraph11 = new Paragraph("STUDENT'S NAME    :PRERANA");
Paragraph paragraph12 = new Paragraph("FATHER'S NAME      :VISHNU GUPTA");
Paragraph paragraph13 = new Paragraph("MOTHER'S NAME     :ANURADHA");
Paragraph paragraph14 = new Paragraph("COLLAGE NAME      :(0002)RAJA BALWANT SINGH COLLEGE,AGRA");

//Set alignment, spacing etc on Paragraph1
paragraph1.setSpacingAfter(0);
paragraph1.setSpacingBefore(0);
paragraph1.setAlignment(Element.ALIGN_CENTER);
paragraph1.setIndentationLeft(40);
paragraph1.setIndentationRight(40);

//Set alignment, spacing etc on Paragraph2
paragraph2.setSpacingAfter(0);
paragraph2.setSpacingBefore(0);
paragraph2.setAlignment(Element.ALIGN_CENTER);
paragraph2.setIndentationLeft(40);
paragraph2.setIndentationRight(40);
//Set alignment, spacing etc on Paragraph3
paragraph3.setSpacingAfter(0);
paragraph3.setSpacingBefore(0);
paragraph3.setAlignment(Element.ALIGN_CENTER);
paragraph3.setIndentationLeft(40);
paragraph3.setIndentationRight(40);
//Set alignment, spacing etc on Paragraph4
paragraph4.setSpacingAfter(0);
paragraph4.setSpacingBefore(0);
paragraph4.setAlignment(Element.ALIGN_CENTER);
paragraph4.setIndentationLeft(40);
paragraph4.setIndentationRight(40);
//Set alignment, spacing etc on Paragraph5
paragraph5.setSpacingAfter(0);
paragraph5.setSpacingBefore(0);
paragraph5.setAlignment(Element.ALIGN_CENTER);
paragraph5.setIndentationLeft(40);
paragraph5.setIndentationRight(40);
//Set alignment, spacing etc on Paragraph6
paragraph6.setSpacingAfter(0);
paragraph6.setSpacingBefore(0);
paragraph6.setAlignment(Element.ALIGN_CENTER);
paragraph6.setIndentationLeft(40);
paragraph6.setIndentationRight(40);



paragraph14.setSpacingAfter(10);
paragraph14.setSpacingBefore(0);
paragraph14.setAlignment(Element.ALIGN_LEFT);
paragraph14.setIndentationLeft(00);
paragraph14.setIndentationRight(10);


//Add content to the document using Paragraph objects.
document.add(paragraph1);
document.add(paragraph2);
document.add(paragraph3);
document.add(paragraph4);
document.add(paragraph5);
document.add(paragraph6);
document.add(paragraph7);
document.add(paragraph8);
document.add(paragraph9);
document.add(paragraph10);
document.add(paragraph11);
document.add(paragraph12);
document.add(paragraph13);
document.add(paragraph14);
paragraph14.setSpacingAfter(25);
paragraph14.setSpacingBefore(25);

//Create Table object, Here 4 specify the no. of columns
PdfPTable pdfPTable = new PdfPTable(4);
//Create cells
PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("Course Title"));
PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Maximum Marks"));
PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("Minimum Marks"));
PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("Marks Obtained"));
//Add cells to table
pdfPTable.addCell(pdfPCell1);
pdfPTable.addCell(pdfPCell2);
pdfPTable.addCell(pdfPCell3);
pdfPTable.addCell(pdfPCell4); //Add content to the document using Table objects.


//Create cells
PdfPCell pdfPCell5 = new PdfPCell(new Paragraph("computer Fundamental and MS-Office"));
PdfPCell pdfPCell6= new PdfPCell(new Paragraph("50"));
PdfPCell pdfPCell7= new PdfPCell(new Paragraph("20"));
PdfPCell pdfPCell8= new PdfPCell(new Paragraph("30"));
//Add cells to table
pdfPTable.addCell(pdfPCell5);
pdfPTable.addCell(pdfPCell6);
pdfPTable.addCell(pdfPCell7);
pdfPTable.addCell(pdfPCell8); //Add content to the document using Table objects.
//document.add(pdfPTable);
//Create cells
PdfPCell pdfPCell9 = new PdfPCell(new Paragraph("Introduction the Programming using C"));
PdfPCell pdfPCell10 = new PdfPCell(new Paragraph("50"));
PdfPCell pdfPCell11= new PdfPCell(new Paragraph("20"));
PdfPCell pdfPCell12= new PdfPCell(new Paragraph("25"));
//Add cells to table
pdfPTable.addCell(pdfPCell9);
pdfPTable.addCell(pdfPCell10);
pdfPTable.addCell(pdfPCell11);
pdfPTable.addCell(pdfPCell12); //Add content to the document using Table objects.
//document.add(pdfPTable);
//Create cells
PdfPCell pdfPCell13 = new PdfPCell(new Paragraph("Business Communication and Soft Skill"));
PdfPCell pdfPCell14= new PdfPCell(new Paragraph("50"));
PdfPCell pdfPCell15= new PdfPCell(new Paragraph("20"));
PdfPCell pdfPCell16= new PdfPCell(new Paragraph("28"));
//Add cells to table
pdfPTable.addCell(pdfPCell13);
pdfPTable.addCell(pdfPCell14);
pdfPTable.addCell(pdfPCell15);
pdfPTable.addCell(pdfPCell16); //Add content to the document using Table objects.
//document.add(pdfPTable);
//Create cells
PdfPCell pdfPCell17= new PdfPCell(new Paragraph("Introduction to HTML-CSS-XML"));
PdfPCell pdfPCell18 = new PdfPCell(new Paragraph("50"));
PdfPCell pdfPCell19= new PdfPCell(new Paragraph("20"));
PdfPCell pdfPCell20= new PdfPCell(new Paragraph("32"));
//Add cells to table
pdfPTable.addCell(pdfPCell17);
pdfPTable.addCell(pdfPCell18);
pdfPTable.addCell(pdfPCell19);
pdfPTable.addCell(pdfPCell20); //Add content to the document using Table objects.
//document.add(pdfPTable);
//Create cells
PdfPCell pdfPCell21 = new PdfPCell(new Paragraph("Math"));
PdfPCell pdfPCell22 = new PdfPCell(new Paragraph("50"));
PdfPCell pdfPCell23 = new PdfPCell(new Paragraph("20"));
PdfPCell pdfPCell24 = new PdfPCell(new Paragraph("45"));
//Add cells to table
pdfPTable.addCell(pdfPCell21);
pdfPTable.addCell(pdfPCell22);
pdfPTable.addCell(pdfPCell23);
pdfPTable.addCell(pdfPCell24); //Add content to the document using Table objects.
//document.add(pdfPTable);
//Create cells
PdfPCell pdfPCell25 = new PdfPCell(new Paragraph("Practical based on above Papers "));
PdfPCell pdfPCell26= new PdfPCell(new Paragraph("100"));
PdfPCell pdfPCell27= new PdfPCell(new Paragraph("50"));
PdfPCell pdfPCell28= new PdfPCell(new Paragraph("70"));
//Add cells to table
pdfPTable.addCell(pdfPCell25);
pdfPTable.addCell(pdfPCell26);
pdfPTable.addCell(pdfPCell27);
pdfPTable.addCell(pdfPCell28); //Add content to the document using Table objects.
document.add(pdfPTable);


//Close document and outputStream.
document.close();
outputStream.close();
System.out.println("Pdf created successfully.");
} catch (Exception e) {
e.printStackTrace();
}
}
}