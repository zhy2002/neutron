package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TrustBeneficiaryClassListNodeModule {

    private final TrustBeneficiaryClassListNode owner;

    public TrustBeneficiaryClassListNodeModule(TrustBeneficiaryClassListNode owner) {
        this.owner = owner;
    }

    @Provides @TrustBeneficiaryClassListNodeScope @Owner TrustBeneficiaryClassListNode provideTrustBeneficiaryClassListNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassListNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

}