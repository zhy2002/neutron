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

    @Provides @PreviousEmploymentListNodeScope @Owner PreviousEmploymentListNode providePreviousEmploymentListNode() {
        return owner;
    }

    @Provides @PreviousEmploymentListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PreviousEmploymentListNodeScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @PreviousEmploymentListNodeScope
    Map<String, RuleProvider<PreviousEmploymentListNode>> provideInstanceProviders(
        Provider<PersonNodeChildProvider.PreviousEmploymentListNodeRuleProvider> previousEmploymentListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PreviousEmploymentListNode>> result = new HashMap<>();
        result.put("previousEmploymentListNode", previousEmploymentListNodeRuleProvider.get());
        return result;
    }
}