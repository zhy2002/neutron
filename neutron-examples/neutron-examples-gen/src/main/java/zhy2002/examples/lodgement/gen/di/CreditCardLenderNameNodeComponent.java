package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditCardLenderNameNodeScope
@Subcomponent(modules = {CreditCardLenderNameNodeModule.class})
public interface CreditCardLenderNameNodeComponent {

    CreditCardLenderNameNodeRuleProvider getCreditCardLenderNameNodeRuleProvider();
    Map<String, RuleProvider<CreditCardLenderNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardLenderNameNodeModule(CreditCardLenderNameNodeModule module);

        CreditCardLenderNameNodeComponent build();
    }
}
