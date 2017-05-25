package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyContactFirstNameNodeScope
@Subcomponent(modules = {CompanyContactFirstNameNodeModule.class})
public interface CompanyContactFirstNameNodeComponent {

    RuleProvider<CompanyContactFirstNameNode> getCompanyContactFirstNameNodeRuleProvider();
    Map<String, RuleProvider<CompanyContactFirstNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactFirstNameNodeModule(CompanyContactFirstNameNodeModule module);

        CompanyContactFirstNameNodeComponent build();
    }
}
