package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherLiabilityLimitAmountNodeModule.class})
public interface OtherLiabilityLimitAmountNodeComponent {

    RuleProvider<OtherLiabilityLimitAmountNode> getOtherLiabilityLimitAmountNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityLimitAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityLimitAmountNodeModule(OtherLiabilityLimitAmountNodeModule module);

        OtherLiabilityLimitAmountNodeComponent build();
    }
}
