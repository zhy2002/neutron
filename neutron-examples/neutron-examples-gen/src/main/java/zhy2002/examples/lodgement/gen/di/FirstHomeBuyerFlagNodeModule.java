package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class FirstHomeBuyerFlagNodeModule {

    private final FirstHomeBuyerFlagNode owner;

    public FirstHomeBuyerFlagNodeModule(FirstHomeBuyerFlagNode owner) {
        this.owner = owner;
    }

    @Provides @FirstHomeBuyerFlagNodeScope @Owner FirstHomeBuyerFlagNode provideFirstHomeBuyerFlagNode() {
        return owner;
    }

    @Provides @FirstHomeBuyerFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @FirstHomeBuyerFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @FirstHomeBuyerFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @FirstHomeBuyerFlagNodeScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

}