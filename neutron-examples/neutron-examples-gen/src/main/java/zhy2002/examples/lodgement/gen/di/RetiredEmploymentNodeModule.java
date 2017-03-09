package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RetiredEmploymentNodeModule {

    private final RetiredEmploymentNode owner;

    public RetiredEmploymentNodeModule(RetiredEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner RetiredEmploymentNode provideRetiredEmploymentNode() {
        return owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RetiredEmploymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RetiredEmploymentNodeScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @RetiredEmploymentNodeScope
    Map<String, RuleProvider<RetiredEmploymentNode>> provideInstanceProviders(
        Provider<EmploymentNodeChildProvider.RetiredEmploymentNodeRuleProvider> retiredEmploymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<RetiredEmploymentNode>> result = new HashMap<>();
        result.put("retiredEmploymentNode", retiredEmploymentNodeRuleProvider.get());
        return result;
    }
}