package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCardListNodeModule.class})
public interface CreditCardListNodeComponent {

    List<RuleProvider<CreditCardListNode>> provideRuleProviders();

    CreditCardNode createCreditCardNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardListNodeModule(CreditCardListNodeModule module);

        CreditCardListNodeComponent build();
    }

}
