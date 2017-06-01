package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CreditCardListNodeModule.class})
public interface CreditCardListNodeComponent {


    RuleProvider<CreditCardListNode> getCreditCardListNodeRuleProvider();
    Map<String, RuleProvider<CreditCardListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardListNodeModule(CreditCardListNodeModule module);

        CreditCardListNodeComponent build();
    }

}
