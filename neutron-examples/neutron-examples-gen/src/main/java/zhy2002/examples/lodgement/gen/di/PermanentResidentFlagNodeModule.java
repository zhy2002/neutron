package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PermanentResidentFlagNodeModule {

    private final PermanentResidentFlagNode owner;

    public PermanentResidentFlagNodeModule(PermanentResidentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner PermanentResidentFlagNode providePermanentResidentFlagNode() {
        return owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PermanentResidentFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PermanentResidentFlagNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @PermanentResidentFlagNodeScope
    RuleProvider<PermanentResidentFlagNode> provideRuleProvider(Provider<PermanentResidentFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PermanentResidentFlagNodeScope
    Map<String, RuleProvider<PermanentResidentFlagNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.PermanentResidentFlagNodeRuleProvider> permanentResidentFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<PermanentResidentFlagNode>> result = new HashMap<>();
        result.put("permanentResidentFlagNode", permanentResidentFlagNodeRuleProvider.get());
        return result;
    }
}