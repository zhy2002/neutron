package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {BeingPurchasedFlagNodeModule.class})
public interface BeingPurchasedFlagNodeComponent {

    List<RuleProvider<BeingPurchasedFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setBeingPurchasedFlagNodeModule(BeingPurchasedFlagNodeModule module);

        BeingPurchasedFlagNodeComponent build();
    }

}
