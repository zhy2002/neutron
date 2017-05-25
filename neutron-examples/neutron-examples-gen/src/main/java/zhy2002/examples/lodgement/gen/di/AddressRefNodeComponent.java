package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@AddressRefNodeScope
@Subcomponent(modules = {AddressRefNodeModule.class})
public interface AddressRefNodeComponent {

    RuleProvider<AddressRefNode> getAddressRefNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressRefNodeModule(AddressRefNodeModule module);

        AddressRefNodeComponent build();
    }
}
