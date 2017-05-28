package zhy2002.neutron.service;

import freemarker.template.Template;
import zhy2002.neutron.model.CodeGenInfo;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Stateless helper class for code generation.
 */
public class CodeGenerationService {

    public void generateFile(
            String targetDirectory,
            String relativePath,
            CodeGenInfo data,
            Template nodeTemplate
    ) {
        generateFile(targetDirectory, relativePath, data, nodeTemplate, "", "");
    }

    public void generateFile(
            String targetDirectory,
            String relativePath,
            CodeGenInfo data,
            Template nodeTemplate,
            String typePrefix,
            String typeSuffix
    ) {
        generateFile(targetDirectory, relativePath, data, nodeTemplate, typePrefix + data.getTypeName() + typeSuffix);
    }

    public void generateFile(
            String targetDirectory,
            String relativePath,
            CodeGenInfo data,
            Template nodeTemplate,
            String fileName
    ) {
        try {
            Path directory = Paths.get(targetDirectory, relativePath);
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }

            Path filePath = directory.resolve(fileName + ".java");
            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath.toFile())) {
                nodeTemplate.process(data, new OutputStreamWriter(fileOutputStream));
            }
        } catch (Exception ex) {
            throw new RuntimeException("Error occurred while generating file: " + fileName, ex);
        }
    }
}

