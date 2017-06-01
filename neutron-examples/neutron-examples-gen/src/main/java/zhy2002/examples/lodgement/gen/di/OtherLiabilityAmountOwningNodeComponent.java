package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherLiabilityAmountOwningNodeModule.class})
public interface OtherLiabilityAmountOwningNodeComponent {

    List<RuleProvider<OtherLiabilityAmountOwningNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityAmountOwningNodeModule(OtherLiabilityAmountOwningNodeModule module);

        OtherLiabilityAmountOwningNodeComponent build();
    }

}
