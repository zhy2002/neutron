package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCardOwnershipListNodeModule.class})
public interface CreditCardOwnershipListNodeComponent extends OwnershipListNodeComponent {

    List<RuleProvider<CreditCardOwnershipListNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardOwnershipListNodeModule(CreditCardOwnershipListNodeModule module);

        CreditCardOwnershipListNodeComponent build();
    }

}
