package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PropertyAddressNodeModule.class})
public interface PropertyAddressNodeComponent {

    List<RuleProvider<PropertyAddressNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyAddressNodeModule(PropertyAddressNodeModule module);

        PropertyAddressNodeComponent build();
    }

}
