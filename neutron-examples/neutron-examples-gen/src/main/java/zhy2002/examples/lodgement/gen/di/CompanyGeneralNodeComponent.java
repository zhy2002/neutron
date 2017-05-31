package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyGeneralNodeModule.class})
public interface CompanyGeneralNodeComponent {

    RuleProvider<CompanyGeneralNode> getCompanyGeneralNodeRuleProvider();
    Map<String, RuleProvider<CompanyGeneralNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyGeneralNodeModule(CompanyGeneralNodeModule module);

        CompanyGeneralNodeComponent build();
    }
}
