package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SavingsTypeNodeScope
@Subcomponent(modules = {SavingsTypeNodeModule.class})
public interface SavingsTypeNodeComponent {

    SavingsTypeNodeRuleProvider getSavingsTypeNodeRuleProvider();
    Map<String, RuleProvider<SavingsTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsTypeNodeModule(SavingsTypeNodeModule module);

        SavingsTypeNodeComponent build();
    }
}
