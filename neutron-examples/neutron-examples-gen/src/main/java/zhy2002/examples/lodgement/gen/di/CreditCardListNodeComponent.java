package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardListNodeScope
@Subcomponent(modules = {CreditCardListNodeModule.class})
public interface CreditCardListNodeComponent {

    CreditCardListNodeRuleProvider getCreditCardListNodeRuleProvider();
    Map<String, RuleProvider<CreditCardListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardListNodeModule(CreditCardListNodeModule module);

        CreditCardListNodeComponent build();
    }
}
