package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class TrustBeneficiaryClassNodeModule {

    private final TrustBeneficiaryClassNode owner;

    public TrustBeneficiaryClassNodeModule(TrustBeneficiaryClassNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustBeneficiaryClassNode provideTrustBeneficiaryClassNode() {
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

    @Provides @ComponentScope TrustBeneficiaryClassListNode provideTrustBeneficiaryClassListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TrustBeneficiaryClassNode> provideRuleProvider(Provider<TrustBeneficiaryClassNodeRuleProvider> provider) {
        return provider.get();
    }

}