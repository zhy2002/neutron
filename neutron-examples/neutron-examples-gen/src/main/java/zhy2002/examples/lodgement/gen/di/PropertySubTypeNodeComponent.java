package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PropertySubTypeNodeScope
@Subcomponent(modules = {PropertySubTypeNodeModule.class})
public interface PropertySubTypeNodeComponent {

    PropertySubTypeNodeRuleProvider getPropertySubTypeNodeRuleProvider();
    Map<String, RuleProvider<PropertySubTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertySubTypeNodeModule(PropertySubTypeNodeModule module);

        PropertySubTypeNodeComponent build();
    }
}
