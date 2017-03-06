package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CreditHistoryNodeScope
@Subcomponent(modules = {CreditHistoryNodeModule.class})
public interface CreditHistoryNodeComponent {

    CreditHistoryNodeRuleProvider getCreditHistoryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditHistoryNodeModule(CreditHistoryNodeModule module);

        CreditHistoryNodeComponent build();
    }
}
