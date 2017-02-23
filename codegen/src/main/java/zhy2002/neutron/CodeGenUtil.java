package zhy2002.neutron;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Provide static util methods for this module.
 */
public final class CodeGenUtil {

    private CodeGenUtil() {
    }

    static void clearDirectory(String targetDirectory) {
        Path directory = Paths.get(targetDirectory);
        if (deleteDir(directory.toFile())) {
            try {
                Files.createDirectories(directory);
            } catch (IOException ex) {
                throw new RuntimeException("Failed to recreate generated directory.", ex);
            }
        } else {
            throw new RuntimeException("Cannot delete generated directory: " + directory);
        }
    }

    private static boolean deleteDir(File file) {
        if (!file.exists())
            return true;

        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                if (!deleteDir(f))
                    return false;
            }
        }
        return file.delete();
    }

    public static String firstCharLower(String value) {
        if (isEmpty(value))
            return value;

        return value.substring(0, 1).toLowerCase() + value.substring(1);
    }

    public static String allCaps(String value) {
        if (isEmpty(value))
            return value;

        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : value.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                stringBuilder.append('_');
                stringBuilder.append(ch);
            } else {
                stringBuilder.append(Character.toUpperCase(ch));
            }
        }

        return stringBuilder.toString();
    }

    private static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

}
