package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PropertyStateNodeScope
@Subcomponent(modules = {PropertyStateNodeModule.class})
public interface PropertyStateNodeComponent {

    PropertyStateNodeRuleProvider getPropertyStateNodeRuleProvider();
    Map<String, RuleProvider<PropertyStateNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyStateNodeModule(PropertyStateNodeModule module);

        PropertyStateNodeComponent build();
    }
}
