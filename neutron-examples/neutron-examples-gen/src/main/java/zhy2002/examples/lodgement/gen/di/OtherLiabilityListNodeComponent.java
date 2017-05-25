package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherLiabilityListNodeScope
@Subcomponent(modules = {OtherLiabilityListNodeModule.class})
public interface OtherLiabilityListNodeComponent {

    RuleProvider<OtherLiabilityListNode> getOtherLiabilityListNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityListNodeModule(OtherLiabilityListNodeModule module);

        OtherLiabilityListNodeComponent build();
    }
}
