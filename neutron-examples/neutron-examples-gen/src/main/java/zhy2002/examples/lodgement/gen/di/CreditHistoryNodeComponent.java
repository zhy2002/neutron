package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {CreditHistoryNodeModule.class})
public interface CreditHistoryNodeComponent {

    RuleProvider<CreditHistoryNode> getCreditHistoryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditHistoryNodeModule(CreditHistoryNodeModule module);

        CreditHistoryNodeComponent build();
    }
}
