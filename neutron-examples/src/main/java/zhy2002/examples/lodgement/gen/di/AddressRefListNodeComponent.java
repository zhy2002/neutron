package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AddressRefListNodeScope
@Subcomponent(modules = {AddressRefListNodeModule.class})
public interface AddressRefListNodeComponent {

    AddressRefListNodeRuleProvider getAddressRefListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressRefListNodeModule(AddressRefListNodeModule module);

        AddressRefListNodeComponent build();
    }
}
