package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PropertyNodeScope
@Subcomponent(modules = {PropertyNodeModule.class})
public interface PropertyNodeComponent {

    PropertyNodeRuleProvider getPropertyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyNodeModule(PropertyNodeModule module);

        PropertyNodeComponent build();
    }
}
