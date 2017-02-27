package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherIncomeAddBackTypeNodeModule {

    private final OtherIncomeAddBackTypeNode owner;

    public OtherIncomeAddBackTypeNodeModule(OtherIncomeAddBackTypeNode owner) {
        this.owner = owner;
    }

    @Provides @OtherIncomeAddBackTypeNodeScope @Owner OtherIncomeAddBackTypeNode provideOtherIncomeAddBackTypeNode() {
        return owner;
    }

    @Provides @OtherIncomeAddBackTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAddBackTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAddBackTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}