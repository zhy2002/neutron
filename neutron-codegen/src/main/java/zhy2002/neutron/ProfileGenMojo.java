package zhy2002.neutron;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Generate a profile.
 */
@Mojo(name = "generate-profile")
public class ProfileGenMojo extends AbstractMojo {

    @Parameter(property = "nodeFile", required = true)
    private String nodeFile;
    @Parameter(property = "ruleFile", required = true)
    private String ruleFile;
    @Parameter(property = "targetDirectory", required = true)
    private String targetDirectory;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        System.out.println("Running Neutron code gen...");
        System.out.println("node file:" + nodeFile);
        System.out.println("rule file:" + ruleFile);
        System.out.println("target directory:" + targetDirectory);

        new CodeGenerator().generateProfile(nodeFile, ruleFile, targetDirectory);
    }
}
