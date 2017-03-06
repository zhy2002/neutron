package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PropertySubTypeNodeScope
@Subcomponent(modules = {PropertySubTypeNodeModule.class})
public interface PropertySubTypeNodeComponent {

    PropertySubTypeNodeRuleProvider getPropertySubTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertySubTypeNodeModule(PropertySubTypeNodeModule module);

        PropertySubTypeNodeComponent build();
    }
}
