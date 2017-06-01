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

    @Provides @ComponentScope @Owner PermanentResidentFlagNode providePermanentResidentFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PermanentResidentFlagNode> provideRuleProvider(Provider<PermanentResidentFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PermanentResidentFlagNode>> provideInstanceProviderMap(
        Provider<PersonGeneralNodeChildProvider.PermanentResidentFlagNodeRuleProvider> permanentResidentFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<PermanentResidentFlagNode>> result = new HashMap<>();
        result.put("permanentResidentFlagNode", permanentResidentFlagNodeRuleProvider.get());
        return result;
    }
}