package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SettlementDateNodeScope
@Subcomponent(modules = {SettlementDateNodeModule.class})
public interface SettlementDateNodeComponent {

    SettlementDateNodeRuleProvider getSettlementDateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSettlementDateNodeModule(SettlementDateNodeModule module);

        SettlementDateNodeComponent build();
    }
}
