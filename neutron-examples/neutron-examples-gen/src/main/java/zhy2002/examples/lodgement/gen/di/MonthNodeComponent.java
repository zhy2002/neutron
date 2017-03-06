package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MonthNodeScope
@Subcomponent(modules = {MonthNodeModule.class})
public interface MonthNodeComponent {

    MonthNodeRuleProvider getMonthNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMonthNodeModule(MonthNodeModule module);

        MonthNodeComponent build();
    }
}
