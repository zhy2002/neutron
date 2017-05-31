package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanySelectDirectorNodeModule.class})
public interface CompanySelectDirectorNodeComponent {

    RuleProvider<CompanySelectDirectorNode> getCompanySelectDirectorNodeRuleProvider();
    Map<String, RuleProvider<CompanySelectDirectorNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanySelectDirectorNodeModule(CompanySelectDirectorNodeModule module);

        CompanySelectDirectorNodeComponent build();
    }
}
