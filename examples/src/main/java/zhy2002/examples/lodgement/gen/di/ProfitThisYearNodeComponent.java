package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProfitThisYearNodeScope
@Subcomponent(modules = {ProfitThisYearNodeModule.class})
public interface ProfitThisYearNodeComponent {

    ProfitThisYearNodeRuleProvider getProfitThisYearNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProfitThisYearNodeModule(ProfitThisYearNodeModule module);

        ProfitThisYearNodeComponent build();
    }
}
