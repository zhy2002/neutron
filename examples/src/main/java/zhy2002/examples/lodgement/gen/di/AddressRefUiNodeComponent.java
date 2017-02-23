package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AddressRefUiNodeScope
@Subcomponent(modules = {AddressRefUiNodeModule.class})
public interface AddressRefUiNodeComponent {

    AddressRefUiNodeRuleProvider getAddressRefUiNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressRefUiNodeModule(AddressRefUiNodeModule module);

        AddressRefUiNodeComponent build();
    }
}
