package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AgeNodeModule {

    private final AgeNode owner;

    public AgeNodeModule(AgeNode owner) {
        this.owner = owner;
    }

    @Provides @AgeNodeScope @Owner AgeNode provideAgeNode() {
        return owner;
    }

    @Provides @AgeNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @AgeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AgeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AgeNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @AgeNodeScope
    Map<String, RuleProvider<AgeNode>> provideInstanceProviders(
        Provider<RegisterNodeChildProvider.AgeNodeRuleProvider> ageNodeRuleProvider
    ) {
        Map<String, RuleProvider<AgeNode>> result = new HashMap<>();
        result.put("ageNode", ageNodeRuleProvider.get());
        return result;
    }
}