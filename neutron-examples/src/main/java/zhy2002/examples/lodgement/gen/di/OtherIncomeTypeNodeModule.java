package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherIncomeTypeNodeModule {

    private final OtherIncomeTypeNode owner;

    public OtherIncomeTypeNodeModule(OtherIncomeTypeNode owner) {
        this.owner = owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner OtherIncomeTypeNode provideOtherIncomeTypeNode() {
        return owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherIncomeTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}