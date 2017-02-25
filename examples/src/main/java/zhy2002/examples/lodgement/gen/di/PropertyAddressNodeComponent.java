package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
