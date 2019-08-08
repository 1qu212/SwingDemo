package chooser;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class JavaFileFilter extends FileFilter {
    String ext;

    public JavaFileFilter(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        String fileName = file.getName();
        int index = fileName.lastIndexOf(".");
        if (index > 0 && index < fileName.length()) {
            String extension = fileName.substring(index + 1).toLowerCase();
            if (extension.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        if ("java".equals(ext)) {
            return "JAVA Source File(*.java)";
        } else if ("class".equals(ext)) {
            return "JAVA Class File(*.class)";
        }
        return "";
    }
}
