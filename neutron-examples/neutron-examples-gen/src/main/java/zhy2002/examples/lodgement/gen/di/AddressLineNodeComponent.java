package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AddressLineNodeModule.class})
public interface AddressLineNodeComponent {

    List<RuleProvider<AddressLineNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setAddressLineNodeModule(AddressLineNodeModule module);

        AddressLineNodeComponent build();
    }

}
