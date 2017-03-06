package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherLiabilityLimitAmountNodeScope
@Subcomponent(modules = {OtherLiabilityLimitAmountNodeModule.class})
public interface OtherLiabilityLimitAmountNodeComponent {

    OtherLiabilityLimitAmountNodeRuleProvider getOtherLiabilityLimitAmountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityLimitAmountNodeModule(OtherLiabilityLimitAmountNodeModule module);

        OtherLiabilityLimitAmountNodeComponent build();
    }
}
