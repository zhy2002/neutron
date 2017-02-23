package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AddressListNodeScope
@Subcomponent(modules = {AddressListNodeModule.class})
public interface AddressListNodeComponent {

    AddressListNodeRuleProvider getAddressListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressListNodeModule(AddressListNodeModule module);

        AddressListNodeComponent build();
    }
}
