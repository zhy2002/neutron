package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherLiabilityOwnershipListNodeScope
@Subcomponent(modules = {OtherLiabilityOwnershipListNodeModule.class})
public interface OtherLiabilityOwnershipListNodeComponent {

    RuleProvider<OtherLiabilityOwnershipListNode> getOtherLiabilityOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityOwnershipListNodeModule(OtherLiabilityOwnershipListNodeModule module);

        OtherLiabilityOwnershipListNodeComponent build();
    }
}
