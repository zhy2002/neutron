package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CreditHistoryListNodeScope
@Subcomponent(modules = {CreditHistoryListNodeModule.class})
public interface CreditHistoryListNodeComponent {

    CreditHistoryListNodeRuleProvider getCreditHistoryListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditHistoryListNodeModule(CreditHistoryListNodeModule module);

        CreditHistoryListNodeComponent build();
    }
}
