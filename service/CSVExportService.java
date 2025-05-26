package service;

public class CSVExportService implements Exportable {
    @Override
    public void export() {
        System.out.println("Exporting to CSV...");
    }
}
