package service;

public class PDFExportService implements Exportable {
    @Override
    public void export() {
        System.out.println("Exporting to PDF...");
    }
}
