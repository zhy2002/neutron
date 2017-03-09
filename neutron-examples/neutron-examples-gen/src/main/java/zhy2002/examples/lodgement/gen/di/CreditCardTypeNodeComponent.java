package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardTypeNodeScope
@Subcomponent(modules = {CreditCardTypeNodeModule.class})
public interface CreditCardTypeNodeComponent {

    CreditCardTypeNodeRuleProvider getCreditCardTypeNodeRuleProvider();
    Map<String, RuleProvider<CreditCardTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardTypeNodeModule(CreditCardTypeNodeModule module);

        CreditCardTypeNodeComponent build();
    }
}
