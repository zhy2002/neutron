package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
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

    @Provides @TrustBeneficiaryClassNodeScope @Owner TrustBeneficiaryClassNode provideTrustBeneficiaryClassNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TrustBeneficiaryClassNodeScope TrustBeneficiaryClassListNode provideTrustBeneficiaryClassListNode() {
        return owner.getParent();
    }

}