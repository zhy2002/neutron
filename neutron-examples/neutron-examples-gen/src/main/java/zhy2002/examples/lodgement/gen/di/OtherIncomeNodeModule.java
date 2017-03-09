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

    @Provides @OtherIncomeNodeScope @Owner OtherIncomeNode provideOtherIncomeNode() {
        return owner;
    }

    @Provides @OtherIncomeNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @OtherIncomeNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OtherIncomeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherIncomeNodeScope BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
        return owner.getParent();
    }

}