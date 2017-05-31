package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AccountHolderReferenceNodeModule.class})
public interface AccountHolderReferenceNodeComponent {

    RuleProvider<AccountHolderReferenceNode> getAccountHolderReferenceNodeRuleProvider();
    Map<String, RuleProvider<AccountHolderReferenceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccountHolderReferenceNodeModule(AccountHolderReferenceNodeModule module);

        AccountHolderReferenceNodeComponent build();
    }
}
