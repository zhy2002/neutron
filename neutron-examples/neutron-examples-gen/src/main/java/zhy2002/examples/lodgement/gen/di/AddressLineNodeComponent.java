package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AddressLineNodeModule.class})
public interface AddressLineNodeComponent {


    RuleProvider<AddressLineNode> getAddressLineNodeRuleProvider();
    Map<String, RuleProvider<AddressLineNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAddressLineNodeModule(AddressLineNodeModule module);

        AddressLineNodeComponent build();
    }

}
