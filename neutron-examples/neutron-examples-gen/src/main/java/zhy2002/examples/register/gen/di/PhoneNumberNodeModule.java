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

    @Provides @ComponentScope @Owner PhoneNumberNode providePhoneNumberNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope PhoneInfoNode providePhoneInfoNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PhoneNumberNode> provideRuleProvider(Provider<PhoneNumberNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PhoneNumberNode>> provideInstanceProviderMap(
        Provider<PhoneInfoNodeChildProvider.PhoneNumberNodeRuleProvider> phoneNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<PhoneNumberNode>> result = new HashMap<>();
        result.put("phoneNumberNode", phoneNumberNodeRuleProvider.get());
        return result;
    }
}