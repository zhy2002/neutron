package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@BeingPurchasedFlagNodeScope
@Subcomponent(modules = {BeingPurchasedFlagNodeModule.class})
public interface BeingPurchasedFlagNodeComponent {

    BeingPurchasedFlagNodeRuleProvider getBeingPurchasedFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setBeingPurchasedFlagNodeModule(BeingPurchasedFlagNodeModule module);

        BeingPurchasedFlagNodeComponent build();
    }
}
