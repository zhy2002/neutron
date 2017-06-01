package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ResponsibleRepaymentDifficultyNodeModule.class})
public interface ResponsibleRepaymentDifficultyNodeComponent {


    RuleProvider<ResponsibleRepaymentDifficultyNode> getResponsibleRepaymentDifficultyNodeRuleProvider();
    Map<String, RuleProvider<ResponsibleRepaymentDifficultyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setResponsibleRepaymentDifficultyNodeModule(ResponsibleRepaymentDifficultyNodeModule module);

        ResponsibleRepaymentDifficultyNodeComponent build();
    }

}
