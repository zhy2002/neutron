package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherLiabilityBreakCostNodeScope
@Subcomponent(modules = {OtherLiabilityBreakCostNodeModule.class})
public interface OtherLiabilityBreakCostNodeComponent {

    OtherLiabilityBreakCostNodeRuleProvider getOtherLiabilityBreakCostNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityBreakCostNodeModule(OtherLiabilityBreakCostNodeModule module);

        OtherLiabilityBreakCostNodeComponent build();
    }
}
