package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OwnershipPercentageNodeScope
@Subcomponent(modules = {OwnershipPercentageNodeModule.class})
public interface OwnershipPercentageNodeComponent {

    OwnershipPercentageNodeRuleProvider getOwnershipPercentageNodeRuleProvider();
    Map<String, RuleProvider<OwnershipPercentageNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnershipPercentageNodeModule(OwnershipPercentageNodeModule module);

        OwnershipPercentageNodeComponent build();
    }
}
