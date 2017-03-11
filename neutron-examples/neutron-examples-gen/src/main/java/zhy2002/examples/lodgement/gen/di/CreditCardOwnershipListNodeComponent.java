package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardOwnershipListNodeScope
@Subcomponent(modules = {CreditCardOwnershipListNodeModule.class})
public interface CreditCardOwnershipListNodeComponent {

    CreditCardOwnershipListNodeRuleProvider getCreditCardOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<CreditCardOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardOwnershipListNodeModule(CreditCardOwnershipListNodeModule module);

        CreditCardOwnershipListNodeComponent build();
    }
}
