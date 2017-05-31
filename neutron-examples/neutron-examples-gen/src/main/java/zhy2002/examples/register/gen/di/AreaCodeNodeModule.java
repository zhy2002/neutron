package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AreaCodeNodeModule {

    private final AreaCodeNode owner;

    public AreaCodeNodeModule(AreaCodeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AreaCodeNode provideAreaCodeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner PhoneInfoFieldNode providePhoneInfoFieldNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope PhoneInfoNode providePhoneInfoNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AreaCodeNode> provideRuleProvider(Provider<AreaCodeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AreaCodeNode>> provideInstanceProviderMap(
        Provider<PhoneInfoNodeChildProvider.AreaCodeNodeRuleProvider> areaCodeNodeRuleProvider
    ) {
        Map<String, RuleProvider<AreaCodeNode>> result = new HashMap<>();
        result.put("areaCodeNode", areaCodeNodeRuleProvider.get());
        return result;
    }
}