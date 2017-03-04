package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TrustBeneficiaryListNodeModule {

    private final TrustBeneficiaryListNode owner;

    public TrustBeneficiaryListNodeModule(TrustBeneficiaryListNode owner) {
        this.owner = owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner TrustBeneficiaryListNode provideTrustBeneficiaryListNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryListNodeScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

}