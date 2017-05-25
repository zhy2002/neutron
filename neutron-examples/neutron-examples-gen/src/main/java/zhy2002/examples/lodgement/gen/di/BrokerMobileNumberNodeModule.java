package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BrokerMobileNumberNodeModule {

    private final BrokerMobileNumberNode owner;

    public BrokerMobileNumberNodeModule(BrokerMobileNumberNode owner) {
        this.owner = owner;
    }

    @Provides @BrokerMobileNumberNodeScope @Owner BrokerMobileNumberNode provideBrokerMobileNumberNode() {
        return owner;
    }

    @Provides @BrokerMobileNumberNodeScope @Owner BaseMobileNumberNode<?> provideBaseMobileNumberNode() {
        return owner;
    }

    @Provides @BrokerMobileNumberNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @BrokerMobileNumberNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BrokerMobileNumberNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BrokerMobileNumberNodeScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @BrokerMobileNumberNodeScope
    RuleProvider<BrokerMobileNumberNode> provideRuleProvider(Provider<BrokerMobileNumberNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @BrokerMobileNumberNodeScope
    Map<String, RuleProvider<BrokerMobileNumberNode>> provideInstanceProviderMap(
        Provider<SubmissionNodeChildProvider.MobileNumberNodeRuleProvider> mobileNumberNodeRuleProvider
    ) {
        Map<String, RuleProvider<BrokerMobileNumberNode>> result = new HashMap<>();
        result.put("mobileNumberNode", mobileNumberNodeRuleProvider.get());
        return result;
    }
}