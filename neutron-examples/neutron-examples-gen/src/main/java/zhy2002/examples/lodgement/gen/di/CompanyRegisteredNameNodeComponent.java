package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyRegisteredNameNodeScope
@Subcomponent(modules = {CompanyRegisteredNameNodeModule.class})
public interface CompanyRegisteredNameNodeComponent {

    RuleProvider<CompanyRegisteredNameNode> getCompanyRegisteredNameNodeRuleProvider();
    Map<String, RuleProvider<CompanyRegisteredNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegisteredNameNodeModule(CompanyRegisteredNameNodeModule module);

        CompanyRegisteredNameNodeComponent build();
    }
}
