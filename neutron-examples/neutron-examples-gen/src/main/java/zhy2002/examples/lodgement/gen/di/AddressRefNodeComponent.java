package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {AddressRefNodeModule.class})
public interface AddressRefNodeComponent {

    RuleProvider<AddressRefNode> getAddressRefNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressRefNodeModule(AddressRefNodeModule module);

        AddressRefNodeComponent build();
    }
}
