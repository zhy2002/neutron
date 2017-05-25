package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SavingsAccountNameNodeScope
@Subcomponent(modules = {SavingsAccountNameNodeModule.class})
public interface SavingsAccountNameNodeComponent {

    RuleProvider<SavingsAccountNameNode> getSavingsAccountNameNodeRuleProvider();
    Map<String, RuleProvider<SavingsAccountNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountNameNodeModule(SavingsAccountNameNodeModule module);

        SavingsAccountNameNodeComponent build();
    }
}
