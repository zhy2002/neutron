package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SavingsOwnershipListNodeModule.class})
public interface SavingsOwnershipListNodeComponent extends OwnershipListNodeComponent {


    RuleProvider<SavingsOwnershipListNode> getSavingsOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<SavingsOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsOwnershipListNodeModule(SavingsOwnershipListNodeModule module);

        SavingsOwnershipListNodeComponent build();
    }

}
