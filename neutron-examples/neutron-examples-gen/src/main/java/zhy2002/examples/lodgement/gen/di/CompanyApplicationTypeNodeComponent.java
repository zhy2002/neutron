package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyApplicationTypeNodeScope
@Subcomponent(modules = {CompanyApplicationTypeNodeModule.class})
public interface CompanyApplicationTypeNodeComponent {

    CompanyApplicationTypeNodeRuleProvider getCompanyApplicationTypeNodeRuleProvider();
    Map<String, RuleProvider<CompanyApplicationTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyApplicationTypeNodeModule(CompanyApplicationTypeNodeModule module);

        CompanyApplicationTypeNodeComponent build();
    }
}
