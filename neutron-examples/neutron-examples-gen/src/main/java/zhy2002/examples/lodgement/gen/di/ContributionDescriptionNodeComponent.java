package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ContributionDescriptionNodeScope
@Subcomponent(modules = {ContributionDescriptionNodeModule.class})
public interface ContributionDescriptionNodeComponent {

    ContributionDescriptionNodeRuleProvider getContributionDescriptionNodeRuleProvider();
    Map<String, RuleProvider<ContributionDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setContributionDescriptionNodeModule(ContributionDescriptionNodeModule module);

        ContributionDescriptionNodeComponent build();
    }
}
