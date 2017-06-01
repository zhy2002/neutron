package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditCardTypeNodeModule.class})
public interface CreditCardTypeNodeComponent {

    List<RuleProvider<CreditCardTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardTypeNodeModule(CreditCardTypeNodeModule module);

        CreditCardTypeNodeComponent build();
    }

}
