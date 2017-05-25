package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PrimaryApplicantFlagNodeScope
@Subcomponent(modules = {PrimaryApplicantFlagNodeModule.class})
public interface PrimaryApplicantFlagNodeComponent {

    RuleProvider<PrimaryApplicantFlagNode> getPrimaryApplicantFlagNodeRuleProvider();
    Map<String, RuleProvider<PrimaryApplicantFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPrimaryApplicantFlagNodeModule(PrimaryApplicantFlagNodeModule module);

        PrimaryApplicantFlagNodeComponent build();
    }
}
