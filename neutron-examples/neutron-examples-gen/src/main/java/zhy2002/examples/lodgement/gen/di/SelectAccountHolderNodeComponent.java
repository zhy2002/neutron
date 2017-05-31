package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {SelectAccountHolderNodeModule.class})
public interface SelectAccountHolderNodeComponent {

    RuleProvider<SelectAccountHolderNode> getSelectAccountHolderNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectAccountHolderNodeModule(SelectAccountHolderNodeModule module);

        SelectAccountHolderNodeComponent build();
    }
}
