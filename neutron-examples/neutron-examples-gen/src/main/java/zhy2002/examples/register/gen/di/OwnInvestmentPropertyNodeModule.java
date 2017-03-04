package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OwnInvestmentPropertyNodeModule {

    private final OwnInvestmentPropertyNode owner;

    public OwnInvestmentPropertyNodeModule(OwnInvestmentPropertyNode owner) {
        this.owner = owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner OwnInvestmentPropertyNode provideOwnInvestmentPropertyNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OwnInvestmentPropertyNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

}