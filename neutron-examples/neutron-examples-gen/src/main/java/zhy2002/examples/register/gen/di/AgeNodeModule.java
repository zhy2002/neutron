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

    @Provides @ComponentScope @Owner AgeNode provideAgeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AgeNode> provideRuleProvider(Provider<AgeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AgeNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.AgeNodeRuleProvider> ageNodeRuleProvider
    ) {
        Map<String, RuleProvider<AgeNode>> result = new HashMap<>();
        result.put("ageNode", ageNodeRuleProvider.get());
        return result;
    }
}