import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\temp");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\src");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\res");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\savegames");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\src\\main");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\src\\test");
        createFile("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\src\\main//Main.java");
        createFile("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\src\\main//Utils.java");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\res\\drawables");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\res\\vectors");
        createFolder("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\res\\icons");
        createFile("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\temp//temp.txt");


    }

    public static void createFolder(String nameFolder) {
        StringBuilder stringBuilder = new StringBuilder();
        File dir = new File(nameFolder);
        if (dir.mkdir()) {
            stringBuilder.append("Папка " + dir.getName() + " была создана. Полный путь: " + nameFolder);
            log(stringBuilder);
        }
    }

    public static void createFile(String nameFile) {
        StringBuilder stringBuilder = new StringBuilder();
        File myFile = new File(nameFile);
        try {
            if (myFile.createNewFile()) {
                stringBuilder.append("Файл " + myFile.getName() + " был создан. Полный путь: " + nameFile);
                log(stringBuilder);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void log(StringBuilder str) {
        String text = str.toString();
        try (FileWriter writer = new FileWriter("C:\\Users\\in_sd\\IdeaProjects\\Installation\\Games\\temp//temp.txt", true)) {
            writer.write(text);
            writer.append('\n');
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}