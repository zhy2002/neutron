package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class LoanNodeModule {

    private final LoanNode owner;

    public LoanNodeModule(LoanNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanNode provideLoanNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope LoanListNode provideLoanListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LoanNode> provideRuleProvider(Provider<LoanNodeRuleProvider> provider) {
        return provider.get();
    }

}