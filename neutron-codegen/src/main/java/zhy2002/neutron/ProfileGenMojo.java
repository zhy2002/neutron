package zhy2002.neutron;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * Maven mojo for profile code generation.
 */
@Mojo(name = "generate-profile")
public class ProfileGenMojo extends AbstractMojo {

    /**
     * The domain description file.
     */
    @Parameter(property = "nodeFile", required = true)
    private String nodeFile;
    /**
     * The profile description files.
     * Code will be generated in a sibling folder named 'gen'.
     */
    @Parameter(property = "ruleFile", required = true)
    private List<String> ruleFiles;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("Running Neutron profile code generation...");
        getLog().debug("- node file:" + nodeFile);
        getLog().debug("- rule file:" + ruleFiles);

        new CodeGenerator().generateProfiles(nodeFile, ruleFiles);
    }
}
