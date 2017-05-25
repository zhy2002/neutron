package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardOwnershipListNodeScope
@Subcomponent(modules = {CreditCardOwnershipListNodeModule.class})
public interface CreditCardOwnershipListNodeComponent {

    RuleProvider<CreditCardOwnershipListNode> getCreditCardOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<CreditCardOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardOwnershipListNodeModule(CreditCardOwnershipListNodeModule module);

        CreditCardOwnershipListNodeComponent build();
    }
}
