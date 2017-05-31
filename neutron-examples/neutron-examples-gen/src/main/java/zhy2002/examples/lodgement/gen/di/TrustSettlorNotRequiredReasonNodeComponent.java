package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {TrustSettlorNotRequiredReasonNodeModule.class})
public interface TrustSettlorNotRequiredReasonNodeComponent {

    RuleProvider<TrustSettlorNotRequiredReasonNode> getTrustSettlorNotRequiredReasonNodeRuleProvider();
    Map<String, RuleProvider<TrustSettlorNotRequiredReasonNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustSettlorNotRequiredReasonNodeModule(TrustSettlorNotRequiredReasonNodeModule module);

        TrustSettlorNotRequiredReasonNodeComponent build();
    }
}
