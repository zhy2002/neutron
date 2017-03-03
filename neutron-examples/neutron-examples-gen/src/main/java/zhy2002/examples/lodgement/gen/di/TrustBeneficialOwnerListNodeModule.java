package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TrustBeneficialOwnerListNodeModule {

    private final TrustBeneficialOwnerListNode owner;

    public TrustBeneficialOwnerListNodeModule(TrustBeneficialOwnerListNode owner) {
        this.owner = owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner TrustBeneficialOwnerListNode provideTrustBeneficialOwnerListNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner SelectAccountHolderListNode<?> provideSelectAccountHolderListNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @TrustBeneficialOwnerListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}