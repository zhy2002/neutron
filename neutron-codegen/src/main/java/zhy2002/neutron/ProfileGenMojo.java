package zhy2002.neutron;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

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
     * The profile description file.
     */
    @Parameter(property = "ruleFile", required = true)
    private String ruleFile;
    /**
     * The path of the directory where generated code is put.
     * By convention the directory name is
     * 'DOMAIN_ROOT/PROFILE_NAME/gen'.
     */
    @Parameter(property = "targetDirectory", required = true)
    private String targetDirectory;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("Running Neutron profile code generation...");
        getLog().debug("- node file:" + nodeFile);
        getLog().debug("- rule file:" + ruleFile);
        getLog().debug("- target directory:" + targetDirectory);

        new CodeGenerator().generateProfile(nodeFile, ruleFile, targetDirectory);
    }
}
