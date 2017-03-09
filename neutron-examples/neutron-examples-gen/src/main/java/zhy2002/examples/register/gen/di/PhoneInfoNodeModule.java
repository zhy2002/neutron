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

    @Provides @PhoneInfoNodeScope @Owner PhoneInfoNode providePhoneInfoNode() {
        return owner;
    }

    @Provides @PhoneInfoNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PhoneInfoNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PhoneInfoNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PhoneInfoNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @PhoneInfoNodeScope
    Map<String, RuleProvider<PhoneInfoNode>> provideInstanceProviders(
        Provider<RegisterNodeChildProvider.HomePhoneNodeRuleProvider> homePhoneNodeRuleProvider
    ) {
        Map<String, RuleProvider<PhoneInfoNode>> result = new HashMap<>();
        result.put("homePhoneNode", homePhoneNodeRuleProvider.get());
        return result;
    }
}