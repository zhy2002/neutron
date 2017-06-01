package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class SelectRelatedPersonNodeModule {

    private final SelectRelatedPersonNode owner;

    public SelectRelatedPersonNodeModule(SelectRelatedPersonNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonNode provideSelectRelatedPersonNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SelectRelatedPersonNode> provideRuleProvider(Provider<SelectRelatedPersonNodeRuleProvider> provider) {
        return provider.get();
    }

}