package zhy2002.neutron;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Maven mojo for profile code generation.
 */
@Mojo(name = "generate-domain")
public class DomainGenMojo extends AbstractMojo {

    @Parameter(property = "nodeFile", required = true)
    private String nodeFile;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("Running Neutron domain code generation...");
        getLog().debug("- node file:" + nodeFile);

        new CodeGenerator().generateDomain(nodeFile);
    }

}
