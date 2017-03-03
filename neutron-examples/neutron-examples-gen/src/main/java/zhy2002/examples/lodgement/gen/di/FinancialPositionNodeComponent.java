package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@FinancialPositionNodeScope
@Subcomponent(modules = {FinancialPositionNodeModule.class})
public interface FinancialPositionNodeComponent {

    FinancialPositionNodeRuleProvider getFinancialPositionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setFinancialPositionNodeModule(FinancialPositionNodeModule module);

        FinancialPositionNodeComponent build();
    }
}
