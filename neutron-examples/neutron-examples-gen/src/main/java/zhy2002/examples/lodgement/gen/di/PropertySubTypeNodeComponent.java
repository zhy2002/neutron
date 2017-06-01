package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PropertySubTypeNodeModule.class})
public interface PropertySubTypeNodeComponent {


    RuleProvider<PropertySubTypeNode> getPropertySubTypeNodeRuleProvider();
    Map<String, RuleProvider<PropertySubTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertySubTypeNodeModule(PropertySubTypeNodeModule module);

        PropertySubTypeNodeComponent build();
    }

}
