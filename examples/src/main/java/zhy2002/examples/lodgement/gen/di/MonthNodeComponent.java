package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
