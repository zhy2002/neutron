package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@PropertyStateNodeScope
@Subcomponent(modules = {PropertyStateNodeModule.class})
public interface PropertyStateNodeComponent {

    PropertyStateNodeRuleProvider getPropertyStateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyStateNodeModule(PropertyStateNodeModule module);

        PropertyStateNodeComponent build();
    }
}
