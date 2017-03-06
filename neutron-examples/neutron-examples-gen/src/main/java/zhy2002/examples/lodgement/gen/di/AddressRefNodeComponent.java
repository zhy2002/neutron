package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AddressRefNodeScope
@Subcomponent(modules = {AddressRefNodeModule.class})
public interface AddressRefNodeComponent {

    AddressRefNodeRuleProvider getAddressRefNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressRefNodeModule(AddressRefNodeModule module);

        AddressRefNodeComponent build();
    }
}
