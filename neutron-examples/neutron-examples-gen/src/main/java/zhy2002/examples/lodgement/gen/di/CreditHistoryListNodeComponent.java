package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CreditHistoryListNodeScope
@Subcomponent(modules = {CreditHistoryListNodeModule.class})
public interface CreditHistoryListNodeComponent {

    RuleProvider<CreditHistoryListNode> getCreditHistoryListNodeRuleProvider();
    Map<String, RuleProvider<CreditHistoryListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditHistoryListNodeModule(CreditHistoryListNodeModule module);

        CreditHistoryListNodeComponent build();
    }
}
