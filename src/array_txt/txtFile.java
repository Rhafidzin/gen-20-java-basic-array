

package array_txt;

// import class
import java.io.*;
import java.util.Scanner; // Scanner untuk show isi text (membaca)

public class txtFile {
        // membuat variabel data
        static String data;
        static String source = "C:\\Users\\Ryzen\\IdeaProjects\\gen-20-java-basic-array\\";


    // membuat Method readFile
    static void readFile(String fileName) {

        // Statement untuk uji coba code yang dijalankan
        try {
            // memanggil class File untuk mengambil sebuah file txt dari folder dengan nama reading
            File reading = new File(source + fileName +".txt");

            // memanggil class Scanner dengan value dari File reading
            Scanner reader = new Scanner(reading);

//            melakukan looping menggunakan while untuk mengambil data dari scanner

            if (reader.hasNextLine()){

                    System.out.println("Berikut isi dari file " + fileName + ".txt" + ": ");
                    System.out.println(reader.nextLine()); // ouput stdout dari hasil reader

            } else {
                System.out.println("File ini tidak isi");
            }

            // menerima hasil error dari class FileNotFoundException
            } catch (FileNotFoundException e){
            System.out.println("Terjadi Error."); // stdout jika terjadi error dari try

            // untuk tracking jika terjadi error
//            e.printStackTrace();
        }
    }

        static void fileDesc(String fileName){
            // Statement untuk uji coba code yang dijalankan
            try {
                // memanggil class File untuk mengambil sebuah file txt dari folder dengan nama reading
                File reading = new File(source + fileName + ".txt");

                // memanggil class Scanner dengan value dari File reading
                Scanner reader = new Scanner(reading);

//            melakukan looping menggunakan while untuk mengambil data dari scanner
                while (reader.hasNextLine()){

                    data = reader.nextLine();
                    System.out.println("File Description:");
                    System.out.println("File name: " + reading.getName());
                    System.out.println("File Path: " + reading.getAbsoluteFile());
                    System.out.println("File size: " + reading.length() + " bytes");
                }
                reader.close();

                // menerima hasil error dari class FileNotFoundException
            } catch (FileNotFoundException e){
                System.out.println("Terjadi Error."); // stdout jika terjadi error dari try

                // untuk tracking jika terjadi error
//            e.printStackTrace();
            }
        }

        static void createFile(String fileName){
            try {
                File reading = new File(source + fileName + ".txt");

                if(reading.createNewFile()){
                    System.out.println("File created: " + reading.getName());
                } else {
                    System.out.println("File already exist");
                }
            } catch (IOException e){
                System.out.println("Terjadi Error.");
                // untuk tracking jika terjadi error
//            e.printStackTrace();
            }
        }

        static void writeFile(String fileName){
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Tulis isi dari text:");

                String isi = input.nextLine();
                FileWriter writer = new FileWriter(fileName + ".txt");
                writer.write(isi);
                writer.close();
                System.out.println("Isi text berhasil disimpan.");
            } catch (IOException e){
                System.out.println("Terjadi Error.");
            }
        }

        static void deleteFile(String fileName){
            File file = new File(fileName + ".txt");
            if(file.delete()){
                System.out.println("File telah dihapus: " + fileName);
            } else {
                System.out.println("Gagal menghapus file");
            }
        }

    public static void main(String[] args) {
        String fileName;
        // memanggil method
        File dir = new File(source);
        String[] list = dir.list();
        System.out.println("Berikut list file dalam folder:");
        for (String fileList : list) {
            System.out.println(fileList);
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Ketik operasi yang diinginkan:");
        System.out.println("Lihat isi file = read");
        System.out.println("Lihat deskripsi file = desc");
        System.out.println("Membuat file text baru = create");
        System.out.println("Mengisi isi text ke file = write");
        System.out.println("Menghapus sebuah file = delete");
        String value = input.nextLine();



        switch (value){

            case "read":
                System.out.print("Ketik nama file: ");
                fileName = input.nextLine();
                readFile(fileName);
                break;
            case "desc":
                System.out.print("Ketik nama file: ");
                fileName = input.nextLine();
                fileDesc(fileName);
                break;
            case "create":
                System.out.print("Ketik nama file: ");
                fileName = input.nextLine();
                createFile(fileName);
                break;
            case "write":
                System.out.print("Ketik nama file: ");
                fileName = input.nextLine();
                writeFile(fileName);
                break;
            case "delete":
                System.out.println("Ketik nama file: ");
                fileName = input.nextLine();
                deleteFile(fileName);
                break;
            default:
                System.out.println("Operasi yang diinginkan tidak ada, silahkan input ulang");

        }
    }
}
