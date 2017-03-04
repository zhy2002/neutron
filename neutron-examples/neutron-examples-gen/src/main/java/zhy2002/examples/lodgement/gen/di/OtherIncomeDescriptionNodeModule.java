package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherIncomeDescriptionNodeModule {

    private final OtherIncomeDescriptionNode owner;

    public OtherIncomeDescriptionNodeModule(OtherIncomeDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @OtherIncomeDescriptionNodeScope @Owner OtherIncomeDescriptionNode provideOtherIncomeDescriptionNode() {
        return owner;
    }

    @Provides @OtherIncomeDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherIncomeDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherIncomeDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherIncomeDescriptionNodeScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

}