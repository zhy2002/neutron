package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherLiabilityAmountOwningNodeScope
@Subcomponent(modules = {OtherLiabilityAmountOwningNodeModule.class})
public interface OtherLiabilityAmountOwningNodeComponent {

    OtherLiabilityAmountOwningNodeRuleProvider getOtherLiabilityAmountOwningNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityAmountOwningNodeModule(OtherLiabilityAmountOwningNodeModule module);

        OtherLiabilityAmountOwningNodeComponent build();
    }
}
