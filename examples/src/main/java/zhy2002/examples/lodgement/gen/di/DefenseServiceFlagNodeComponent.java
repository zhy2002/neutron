package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@DefenseServiceFlagNodeScope
@Subcomponent(modules = {DefenseServiceFlagNodeModule.class})
public interface DefenseServiceFlagNodeComponent {

    DefenseServiceFlagNodeRuleProvider getDefenseServiceFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setDefenseServiceFlagNodeModule(DefenseServiceFlagNodeModule module);

        DefenseServiceFlagNodeComponent build();
    }
}
