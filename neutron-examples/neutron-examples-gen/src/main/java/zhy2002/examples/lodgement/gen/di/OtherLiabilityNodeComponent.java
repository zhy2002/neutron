package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {OtherLiabilityNodeModule.class})
public interface OtherLiabilityNodeComponent {

    RuleProvider<OtherLiabilityNode> getOtherLiabilityNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityNodeModule(OtherLiabilityNodeModule module);

        OtherLiabilityNodeComponent build();
    }
}
