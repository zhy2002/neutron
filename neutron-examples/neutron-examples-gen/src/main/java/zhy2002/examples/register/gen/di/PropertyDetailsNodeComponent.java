package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PropertyDetailsNodeModule.class})
public interface PropertyDetailsNodeComponent {

    RuleProvider<PropertyDetailsNode> getPropertyDetailsNodeRuleProvider();
    Map<String, RuleProvider<PropertyDetailsNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyDetailsNodeModule(PropertyDetailsNodeModule module);

        PropertyDetailsNodeComponent build();
    }
}
