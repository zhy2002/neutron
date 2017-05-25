package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PropertyNodeScope
@Subcomponent(modules = {PropertyNodeModule.class})
public interface PropertyNodeComponent {

    RuleProvider<PropertyNode> getPropertyNodeRuleProvider();
    Map<String, RuleProvider<PropertyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyNodeModule(PropertyNodeModule module);

        PropertyNodeComponent build();
    }
}
