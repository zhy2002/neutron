package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@YearNodeScope
@Subcomponent(modules = {YearNodeModule.class})
public interface YearNodeComponent {

    YearNodeRuleProvider getYearNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setYearNodeModule(YearNodeModule module);

        YearNodeComponent build();
    }
}
