package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherLiabilityBreakCostNodeScope
@Subcomponent(modules = {OtherLiabilityBreakCostNodeModule.class})
public interface OtherLiabilityBreakCostNodeComponent {

    RuleProvider<OtherLiabilityBreakCostNode> getOtherLiabilityBreakCostNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityBreakCostNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityBreakCostNodeModule(OtherLiabilityBreakCostNodeModule module);

        OtherLiabilityBreakCostNodeComponent build();
    }
}
