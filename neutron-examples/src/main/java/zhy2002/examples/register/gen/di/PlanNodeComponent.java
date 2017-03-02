package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@PlanNodeScope
@Subcomponent(modules = {PlanNodeModule.class})
public interface PlanNodeComponent {

    PlanNodeRuleProvider getPlanNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPlanNodeModule(PlanNodeModule module);

        PlanNodeComponent build();
    }
}
