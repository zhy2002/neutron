package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ExistingMortgageListNodeScope
@Subcomponent(modules = {ExistingMortgageListNodeModule.class})
public interface ExistingMortgageListNodeComponent {

    RuleProvider<ExistingMortgageListNode> getExistingMortgageListNodeRuleProvider();
    Map<String, RuleProvider<ExistingMortgageListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExistingMortgageListNodeModule(ExistingMortgageListNodeModule module);

        ExistingMortgageListNodeComponent build();
    }
}
