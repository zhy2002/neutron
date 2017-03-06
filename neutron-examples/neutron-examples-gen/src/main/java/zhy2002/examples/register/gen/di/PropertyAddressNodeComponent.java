package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;

@PropertyAddressNodeScope
@Subcomponent(modules = {PropertyAddressNodeModule.class})
public interface PropertyAddressNodeComponent {

    PropertyAddressNodeRuleProvider getPropertyAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyAddressNodeModule(PropertyAddressNodeModule module);

        PropertyAddressNodeComponent build();
    }
}
