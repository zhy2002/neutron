package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PropertyAddressNodeScope
@Subcomponent(modules = {PropertyAddressNodeModule.class})
public interface PropertyAddressNodeComponent {

    RuleProvider<PropertyAddressNode> getPropertyAddressNodeRuleProvider();
    Map<String, RuleProvider<PropertyAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyAddressNodeModule(PropertyAddressNodeModule module);

        PropertyAddressNodeComponent build();
    }
}
