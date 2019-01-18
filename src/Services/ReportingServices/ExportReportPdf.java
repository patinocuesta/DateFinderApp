package Services.ReportingServices;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

public class ExportReportPdf {

    private String text;
    private File file;
public ExportReportPdf(){}

    public void writePdf (String outputTxtString,String outputPdfString, String text) throws FileNotFoundException, DocumentException {

                String linea, FileName;
                File InFile = null;
                FileReader fr = null;
                BufferedReader br = null;

                //Selecciona el archivo a convertir.
                FileName = outputTxtString;

                // Abre el archivo y crea el reader.
                InFile = new File (FileName);
                fr = new FileReader (InFile);
                br = new BufferedReader(fr);

                //Crea el documento de salida.
                FileOutputStream archivo = new FileOutputStream(outputPdfString);
                Document documento = new Document();
                PdfWriter.getInstance(documento, archivo);
                documento.open();

                try{
                    while((linea=br.readLine())!=null){
                        documento = AddNewLine(documento,linea);
                    }

                }catch(Exception e){e.printStackTrace();

                }finally{
                    // En el finally cerramos el fichero, para asegurarnos en cualquier circunstancia.
                    try{
                        if( null != fr ){
                            fr.close();
                        }
                    }catch (Exception e2){
                        e2.printStackTrace();
                    }
                }

                //Cerramos el documento PDF.
               //documento.close();

            }
        public Document AddNewLine(Document doc, String linea)
                {
                    try{

                        doc.add(new Paragraph(linea));

                                        }catch(DocumentException de){de.printStackTrace();}

                    return doc;
                }

            }





