package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@OtherLiabilityNodeScope
@Subcomponent(modules = {OtherLiabilityNodeModule.class})
public interface OtherLiabilityNodeComponent {

    RuleProvider<OtherLiabilityNode> getOtherLiabilityNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityNodeModule(OtherLiabilityNodeModule module);

        OtherLiabilityNodeComponent build();
    }
}
