package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {OwnershipNodeModule.class})
public interface OwnershipNodeComponent {

    ApplicantReferenceNode createApplicantReferenceNode();
    OwnershipPercentageNode createOwnershipPercentageNode();
    AverageFlagNode createAverageFlagNode();

    RuleProvider<OwnershipNode> getOwnershipNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnershipNodeModule(OwnershipNodeModule module);

        OwnershipNodeComponent build();
    }

}
