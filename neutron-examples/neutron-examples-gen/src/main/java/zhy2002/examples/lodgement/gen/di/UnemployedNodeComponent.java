package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {UnemployedNodeModule.class})
public interface UnemployedNodeComponent {

    UnemployedOnBenefitFlagNode createUnemployedOnBenefitFlagNode();
    StudentFlagNode createStudentFlagNode();
    StudentTypeNode createStudentTypeNode();
    HouseDutiesFlagNode createHouseDutiesFlagNode();
    UnemployedSinceNode createUnemployedSinceNode();

    RuleProvider<UnemployedNode> getUnemployedNodeRuleProvider();
    Map<String, RuleProvider<UnemployedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedNodeModule(UnemployedNodeModule module);

        UnemployedNodeComponent build();
    }

}
