package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PropertyTypeNodeModule.class})
public interface PropertyTypeNodeComponent {

    RuleProvider<PropertyTypeNode> getPropertyTypeNodeRuleProvider();
    Map<String, RuleProvider<PropertyTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyTypeNodeModule(PropertyTypeNodeModule module);

        PropertyTypeNodeComponent build();
    }
}
