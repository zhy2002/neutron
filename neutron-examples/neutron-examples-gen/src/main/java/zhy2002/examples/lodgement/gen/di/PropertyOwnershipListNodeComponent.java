package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PropertyOwnershipListNodeModule.class})
public interface PropertyOwnershipListNodeComponent {

    RuleProvider<PropertyOwnershipListNode> getPropertyOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<PropertyOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyOwnershipListNodeModule(PropertyOwnershipListNodeModule module);

        PropertyOwnershipListNodeComponent build();
    }
}
