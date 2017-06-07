package zhy2002.neutron.service;

import com.google.common.collect.ImmutableMap;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

/**
 * Provide static util methods for this module.
 */
public final class CodeGenUtil {

    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private static final Map<String, String> primitiveToWrapperClassNameMap = ImmutableMap.of(
            "int", "Integer",
            "long", "Long",
            "double", "Double"
    );

    private CodeGenUtil() {
    }

    public static void clearDirectory(String targetDirectory) {
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
        if (ValueUtil.isEmpty(value))
            return value;

        return value.substring(0, 1).toLowerCase() + value.substring(1);
    }

    public static String firstCharUpper(String value) {
        if (ValueUtil.isEmpty(value))
            return value;

        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    public static String allCaps(String value) {
        if (ValueUtil.isEmpty(value))
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

    public static void validateMappedData(Object target) {
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> violations = validator.validate(target);
        if (violations.size() > 0) {
            StringBuilder messageBuilder = new StringBuilder();
            for (ConstraintViolation<Object> violation : violations) {
                messageBuilder.append(violation.getPropertyPath());
                messageBuilder.append(":");
                messageBuilder.append(violation.getMessage());
                messageBuilder.append(System.lineSeparator());
            }
            throw new RuntimeException(messageBuilder.toString());
        }
    }

    public static String primitiveToWrapperClassName(String className) {
        return primitiveToWrapperClassNameMap.getOrDefault(className, className);
    }
}
