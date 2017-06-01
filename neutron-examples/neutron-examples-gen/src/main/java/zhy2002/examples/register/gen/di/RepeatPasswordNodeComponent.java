package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {RepeatPasswordNodeModule.class})
public interface RepeatPasswordNodeComponent {

    List<RuleProvider<RepeatPasswordNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setRepeatPasswordNodeModule(RepeatPasswordNodeModule module);

        RepeatPasswordNodeComponent build();
    }

}
