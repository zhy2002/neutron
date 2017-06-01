package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherLiabilityClearingFlagNodeModule.class})
public interface OtherLiabilityClearingFlagNodeComponent {

    List<RuleProvider<OtherLiabilityClearingFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityClearingFlagNodeModule(OtherLiabilityClearingFlagNodeModule module);

        OtherLiabilityClearingFlagNodeComponent build();
    }

}
