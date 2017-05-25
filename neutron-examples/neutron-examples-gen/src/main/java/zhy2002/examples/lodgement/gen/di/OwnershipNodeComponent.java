package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@OwnershipNodeScope
@Subcomponent(modules = {OwnershipNodeModule.class})
public interface OwnershipNodeComponent {

    RuleProvider<OwnershipNode> getOwnershipNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnershipNodeModule(OwnershipNodeModule module);

        OwnershipNodeComponent build();
    }
}
