package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class RealEstateNodeModule {

    private final RealEstateNode owner;

    public RealEstateNodeModule(RealEstateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RealEstateNode provideRealEstateNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope RealEstateListNode provideRealEstateListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RealEstateNode> provideRuleProvider(Provider<RealEstateNodeRuleProvider> provider) {
        return provider.get();
    }

}