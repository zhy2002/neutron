package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CreditHistoryListNodeModule.class})
public interface CreditHistoryListNodeComponent {

    List<RuleProvider<CreditHistoryListNode>> provideRuleProviders();

    CreditHistoryNode createCreditHistoryNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditHistoryListNodeModule(CreditHistoryListNodeModule module);

        CreditHistoryListNodeComponent build();
    }

}
