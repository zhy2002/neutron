package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ContributionTypeNodeModule.class})
public interface ContributionTypeNodeComponent {

    RuleProvider<ContributionTypeNode> getContributionTypeNodeRuleProvider();
    Map<String, RuleProvider<ContributionTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setContributionTypeNodeModule(ContributionTypeNodeModule module);

        ContributionTypeNodeComponent build();
    }
}
