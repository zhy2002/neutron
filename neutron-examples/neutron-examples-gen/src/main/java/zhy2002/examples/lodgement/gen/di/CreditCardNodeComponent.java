package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {CreditCardNodeModule.class})
public interface CreditCardNodeComponent {

    RuleProvider<CreditCardNode> getCreditCardNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardNodeModule(CreditCardNodeModule module);

        CreditCardNodeComponent build();
    }
}
