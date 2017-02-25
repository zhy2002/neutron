package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProfitPreviousYearNodeScope
@Subcomponent(modules = {ProfitPreviousYearNodeModule.class})
public interface ProfitPreviousYearNodeComponent {

    ProfitPreviousYearNodeRuleProvider getProfitPreviousYearNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProfitPreviousYearNodeModule(ProfitPreviousYearNodeModule module);

        ProfitPreviousYearNodeComponent build();
    }
}
