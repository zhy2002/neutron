package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OwnershipPercentageNodeModule.class})
public interface OwnershipPercentageNodeComponent {

    List<RuleProvider<OwnershipPercentageNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOwnershipPercentageNodeModule(OwnershipPercentageNodeModule module);

        OwnershipPercentageNodeComponent build();
    }

}
