package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@CreditCardNodeScope
@Subcomponent(modules = {CreditCardNodeModule.class})
public interface CreditCardNodeComponent {

    RuleProvider<CreditCardNode> getCreditCardNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardNodeModule(CreditCardNodeModule module);

        CreditCardNodeComponent build();
    }
}
