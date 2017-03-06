package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;

@AgeNodeScope
@Subcomponent(modules = {AgeNodeModule.class})
public interface AgeNodeComponent {

    AgeNodeRuleProvider getAgeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAgeNodeModule(AgeNodeModule module);

        AgeNodeComponent build();
    }
}
