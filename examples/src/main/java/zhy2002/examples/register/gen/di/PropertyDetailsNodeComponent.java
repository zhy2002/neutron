package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.*;

@PropertyDetailsNodeScope
@Subcomponent(modules = {PropertyDetailsNodeModule.class})
public interface PropertyDetailsNodeComponent {

    PropertyDetailsNodeRuleProvider getPropertyDetailsNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyDetailsNodeModule(PropertyDetailsNodeModule module);

        PropertyDetailsNodeComponent build();
    }
}
