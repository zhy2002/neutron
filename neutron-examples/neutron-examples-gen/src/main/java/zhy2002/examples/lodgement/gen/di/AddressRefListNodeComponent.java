package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AddressRefListNodeScope
@Subcomponent(modules = {AddressRefListNodeModule.class})
public interface AddressRefListNodeComponent {

    AddressRefListNodeRuleProvider getAddressRefListNodeRuleProvider();
    Map<String, RuleProvider<AddressRefListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressRefListNodeModule(AddressRefListNodeModule module);

        AddressRefListNodeComponent build();
    }
}
