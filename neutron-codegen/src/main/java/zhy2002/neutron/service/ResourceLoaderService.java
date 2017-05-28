package zhy2002.neutron.service;

import org.yaml.snakeyaml.Yaml;
import zhy2002.neutron.TemplateBundle;
import zhy2002.neutron.model.DomainInfo;
import zhy2002.neutron.model.ProfileInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Stateless helper class for resource loading.
 */
public class ResourceLoaderService {

    public DomainInfo loadDomainInfo(String nodeFile) {
        try {
            DomainInfo domainInfo = new Yaml().loadAs(new FileInputStream(nodeFile), DomainInfo.class);
            domainInfo.initialize();
            return domainInfo;
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public ProfileInfo loadProfileInfo(String ruleFile, DomainInfo domainInfo) {
        try {
            ProfileInfo profileInfo = new Yaml().loadAs(new FileInputStream(ruleFile), ProfileInfo.class);
            profileInfo.setDomainInfo(domainInfo);
            profileInfo.initialize();
            return profileInfo;
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public TemplateBundle loadTemplateBundle() {
        return new TemplateBundle();
    }
}
