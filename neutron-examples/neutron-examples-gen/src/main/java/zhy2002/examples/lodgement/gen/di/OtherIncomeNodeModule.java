package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class OtherIncomeNodeModule {

    private final OtherIncomeNode owner;

    public OtherIncomeNodeModule(OtherIncomeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeNode provideOtherIncomeNode() {
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

    @Provides @ComponentScope BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherIncomeNode> provideRuleProvider(Provider<OtherIncomeNodeRuleProvider> provider) {
        return provider.get();
    }

}