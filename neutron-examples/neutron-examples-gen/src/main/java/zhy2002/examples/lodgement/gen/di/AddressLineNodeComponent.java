package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AddressLineNodeScope
@Subcomponent(modules = {AddressLineNodeModule.class})
public interface AddressLineNodeComponent {

    AddressLineNodeRuleProvider getAddressLineNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressLineNodeModule(AddressLineNodeModule module);

        AddressLineNodeComponent build();
    }
}
