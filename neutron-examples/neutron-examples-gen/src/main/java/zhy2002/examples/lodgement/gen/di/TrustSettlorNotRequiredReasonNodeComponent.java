package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@TrustSettlorNotRequiredReasonNodeScope
@Subcomponent(modules = {TrustSettlorNotRequiredReasonNodeModule.class})
public interface TrustSettlorNotRequiredReasonNodeComponent {

    TrustSettlorNotRequiredReasonNodeRuleProvider getTrustSettlorNotRequiredReasonNodeRuleProvider();
    Map<String, RuleProvider<TrustSettlorNotRequiredReasonNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustSettlorNotRequiredReasonNodeModule(TrustSettlorNotRequiredReasonNodeModule module);

        TrustSettlorNotRequiredReasonNodeComponent build();
    }
}
