package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherLiabilityAmountOwningNodeModule.class})
public interface OtherLiabilityAmountOwningNodeComponent {


    RuleProvider<OtherLiabilityAmountOwningNode> getOtherLiabilityAmountOwningNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityAmountOwningNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityAmountOwningNodeModule(OtherLiabilityAmountOwningNodeModule module);

        OtherLiabilityAmountOwningNodeComponent build();
    }

}
