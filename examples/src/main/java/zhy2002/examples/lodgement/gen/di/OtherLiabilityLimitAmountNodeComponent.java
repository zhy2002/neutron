package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
