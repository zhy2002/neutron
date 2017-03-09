package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PropertyOwnershipListNodeScope
@Subcomponent(modules = {PropertyOwnershipListNodeModule.class})
public interface PropertyOwnershipListNodeComponent {

    PropertyOwnershipListNodeRuleProvider getPropertyOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<PropertyOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyOwnershipListNodeModule(PropertyOwnershipListNodeModule module);

        PropertyOwnershipListNodeComponent build();
    }
}
