package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PhoneNumberNodeModule {

    private final PhoneNumberNode owner;

    public PhoneNumberNodeModule(PhoneNumberNode owner) {
        this.owner = owner;
    }

    @Provides @PhoneNumberNodeScope @Owner PhoneNumberNode providePhoneNumberNode() {
        return owner;
    }

    @Provides @PhoneNumberNodeScope @Owner PhoneInfoFieldNode providePhoneInfoFieldNode() {
        return owner;
    }

    @Provides @PhoneNumberNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PhoneNumberNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PhoneNumberNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PhoneNumberNodeScope PhoneInfoNode providePhoneInfoNode() {
        return owner.getParent();
    }

    @Provides @PhoneNumberNodeScope
    RuleProvider<PhoneNumberNode> provideRuleProvider(Provider<PhoneNumberNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PhoneNumberNodeScope
    Map<String, RuleProvider<PhoneNumberNode>> provideInstanceProviderMap(
        Provider<PhoneInfoNodeChildProvider.PhoneNumberNodeRuleProvider> phoneNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<PhoneNumberNode>> result = new HashMap<>();
        result.put("phoneNumberNode", phoneNumberNodeRuleProvider.get());
        return result;
    }
}