package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class CurrentEmploymentNodeModule {

    private final CurrentEmploymentNode owner;

    public CurrentEmploymentNodeModule(CurrentEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CurrentEmploymentNode provideCurrentEmploymentNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope CurrentEmploymentListNode provideCurrentEmploymentListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CurrentEmploymentNode> provideRuleProvider(Provider<CurrentEmploymentNodeRuleProvider> provider) {
        return provider.get();
    }

}