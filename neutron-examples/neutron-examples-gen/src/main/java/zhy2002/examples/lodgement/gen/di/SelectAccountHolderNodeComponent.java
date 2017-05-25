package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@SelectAccountHolderNodeScope
@Subcomponent(modules = {SelectAccountHolderNodeModule.class})
public interface SelectAccountHolderNodeComponent {

    RuleProvider<SelectAccountHolderNode> getSelectAccountHolderNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectAccountHolderNodeModule(SelectAccountHolderNodeModule module);

        SelectAccountHolderNodeComponent build();
    }
}
