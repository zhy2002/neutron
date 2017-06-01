package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PreviousEmploymentListNodeModule {

    private final PreviousEmploymentListNode owner;

    public PreviousEmploymentListNodeModule(PreviousEmploymentListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PreviousEmploymentListNode providePreviousEmploymentListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PreviousEmploymentListNode> provideRuleProvider(Provider<PreviousEmploymentListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PreviousEmploymentListNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PreviousEmploymentListNodeRuleProvider> previousEmploymentListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PreviousEmploymentListNode>> result = new HashMap<>();
        result.put("previousEmploymentListNode", previousEmploymentListNodeRuleProvider.get());
        return result;
    }
}