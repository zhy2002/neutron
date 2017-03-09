package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@BeingPurchasedFlagNodeScope
@Subcomponent(modules = {BeingPurchasedFlagNodeModule.class})
public interface BeingPurchasedFlagNodeComponent {

    BeingPurchasedFlagNodeRuleProvider getBeingPurchasedFlagNodeRuleProvider();
    Map<String, RuleProvider<BeingPurchasedFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setBeingPurchasedFlagNodeModule(BeingPurchasedFlagNodeModule module);

        BeingPurchasedFlagNodeComponent build();
    }
}
