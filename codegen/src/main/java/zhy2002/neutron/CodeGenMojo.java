package zhy2002.neutron;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;


@Mojo(name = "generate")
public class CodeGenMojo extends AbstractMojo {

    @Parameter(property = "definitionFile", required = true)
    private String definitionFile;
    @Parameter(property = "targetDirectory", required = true)
    private String targetDirectory;


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        System.out.println("Running code gen...");
        System.out.println(definitionFile);
        System.out.println(targetDirectory);

        CodeGenerator generator = new CodeGenerator();
        generator.generateFile(definitionFile, targetDirectory);
    }
}
