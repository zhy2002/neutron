package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PhoneInfoNodeModule {

    private final PhoneInfoNode owner;

    public PhoneInfoNodeModule(PhoneInfoNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PhoneInfoNode providePhoneInfoNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PhoneInfoNode> provideRuleProvider(Provider<PhoneInfoNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PhoneInfoNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.HomePhoneNodeRuleProvider> homePhoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<PhoneInfoNode>> result = new HashMap<>();
        result.put("homePhoneNode", homePhoneNodeRuleProvider.get());
        return result;
    }
}