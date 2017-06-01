package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SavingsTypeNodeModule.class})
public interface SavingsTypeNodeComponent {


    RuleProvider<SavingsTypeNode> getSavingsTypeNodeRuleProvider();
    Map<String, RuleProvider<SavingsTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsTypeNodeModule(SavingsTypeNodeModule module);

        SavingsTypeNodeComponent build();
    }

}
