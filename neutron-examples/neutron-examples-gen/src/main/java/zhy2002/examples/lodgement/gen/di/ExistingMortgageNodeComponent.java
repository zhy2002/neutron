package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {ExistingMortgageNodeModule.class})
public interface ExistingMortgageNodeComponent {

    RuleProvider<ExistingMortgageNode> getExistingMortgageNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExistingMortgageNodeModule(ExistingMortgageNodeModule module);

        ExistingMortgageNodeComponent build();
    }
}
