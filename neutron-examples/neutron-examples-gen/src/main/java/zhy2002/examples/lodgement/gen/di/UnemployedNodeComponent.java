package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {UnemployedNodeModule.class})
public interface UnemployedNodeComponent {

    List<RuleProvider<UnemployedNode>> provideRuleProviders();

    UnemployedOnBenefitFlagNode createUnemployedOnBenefitFlagNode();
    StudentFlagNode createStudentFlagNode();
    StudentTypeNode createStudentTypeNode();
    HouseDutiesFlagNode createHouseDutiesFlagNode();
    UnemployedSinceNode createUnemployedSinceNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedNodeModule(UnemployedNodeModule module);

        UnemployedNodeComponent build();
    }

}
