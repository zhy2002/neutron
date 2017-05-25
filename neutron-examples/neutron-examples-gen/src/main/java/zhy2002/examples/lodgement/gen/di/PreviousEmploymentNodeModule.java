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

    @Provides @PreviousEmploymentNodeScope @Owner PreviousEmploymentNode providePreviousEmploymentNode() {
        return owner;
    }

    @Provides @PreviousEmploymentNodeScope @Owner EmploymentNode<?> provideEmploymentNode() {
        return owner;
    }

    @Provides @PreviousEmploymentNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentNodeScope PreviousEmploymentListNode providePreviousEmploymentListNode() {
        return owner.getParent();
    }

    @Provides @PreviousEmploymentNodeScope
    RuleProvider<PreviousEmploymentNode> provideRuleProvider(Provider<PreviousEmploymentNodeRuleProvider> provider) {
        return provider.get();
    }

}