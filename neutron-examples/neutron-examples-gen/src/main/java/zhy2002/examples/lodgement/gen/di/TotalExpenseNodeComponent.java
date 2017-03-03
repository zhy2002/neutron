package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TotalExpenseNodeScope
@Subcomponent(modules = {TotalExpenseNodeModule.class})
public interface TotalExpenseNodeComponent {

    TotalExpenseNodeRuleProvider getTotalExpenseNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTotalExpenseNodeModule(TotalExpenseNodeModule module);

        TotalExpenseNodeComponent build();
    }
}
