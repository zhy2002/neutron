package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CreditCardLenderNameNodeModule.class})
public interface CreditCardLenderNameNodeComponent {


    RuleProvider<CreditCardLenderNameNode> getCreditCardLenderNameNodeRuleProvider();
    Map<String, RuleProvider<CreditCardLenderNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardLenderNameNodeModule(CreditCardLenderNameNodeModule module);

        CreditCardLenderNameNodeComponent build();
    }

}
