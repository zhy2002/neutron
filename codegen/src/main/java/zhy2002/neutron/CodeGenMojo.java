package zhy2002.neutron;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * The Maven plugin to run in the project that uses Neutron.
 */
@Mojo(name = "generate")
public class CodeGenMojo extends AbstractMojo {

    @Parameter(property = "definitionFile", required = true)
    private String definitionFile;
    @Parameter(property = "targetDirectory", required = true)
    private String targetDirectory;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        System.out.println("Running Neutron code gen...");
        System.out.println("definition file:" + definitionFile);
        System.out.println("target directory:" + targetDirectory);

        new CodeGenerator().generate(definitionFile, targetDirectory);
    }

}
