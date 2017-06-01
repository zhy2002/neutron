package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class PreviousEmploymentNodeModule {

    private final PreviousEmploymentNode owner;

    public PreviousEmploymentNodeModule(PreviousEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PreviousEmploymentNode providePreviousEmploymentNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmploymentNode<?> provideEmploymentNode() {
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

    @Provides @ComponentScope PreviousEmploymentListNode providePreviousEmploymentListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PreviousEmploymentNode> provideRuleProvider(Provider<PreviousEmploymentNodeRuleProvider> provider) {
        return provider.get();
    }

}