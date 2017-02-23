package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherLiabilityClearingFlagNodeScope
@Subcomponent(modules = {OtherLiabilityClearingFlagNodeModule.class})
public interface OtherLiabilityClearingFlagNodeComponent {

    OtherLiabilityClearingFlagNodeRuleProvider getOtherLiabilityClearingFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityClearingFlagNodeModule(OtherLiabilityClearingFlagNodeModule module);

        OtherLiabilityClearingFlagNodeComponent build();
    }
}
