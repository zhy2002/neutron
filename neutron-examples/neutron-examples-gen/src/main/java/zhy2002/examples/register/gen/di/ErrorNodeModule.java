package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class ErrorNodeModule {

    private final ErrorNode owner;

    public ErrorNodeModule(ErrorNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ErrorNode provideErrorNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ValidationErrorUiNode<?> provideValidationErrorUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ErrorListNode provideErrorListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ErrorNode> provideRuleProvider(Provider<ErrorNodeRuleProvider> provider) {
        return provider.get();
    }

}