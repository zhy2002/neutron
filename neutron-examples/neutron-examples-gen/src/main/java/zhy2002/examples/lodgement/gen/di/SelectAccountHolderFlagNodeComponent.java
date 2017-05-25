package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SelectAccountHolderFlagNodeScope
@Subcomponent(modules = {SelectAccountHolderFlagNodeModule.class})
public interface SelectAccountHolderFlagNodeComponent {

    RuleProvider<SelectAccountHolderFlagNode> getSelectAccountHolderFlagNodeRuleProvider();
    Map<String, RuleProvider<SelectAccountHolderFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSelectAccountHolderFlagNodeModule(SelectAccountHolderFlagNodeModule module);

        SelectAccountHolderFlagNodeComponent build();
    }
}
