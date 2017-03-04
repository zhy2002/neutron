package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ResponsibleSignificantChangeFlagNodeModule {

    private final ResponsibleSignificantChangeFlagNode owner;

    public ResponsibleSignificantChangeFlagNodeModule(ResponsibleSignificantChangeFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ResponsibleSignificantChangeFlagNodeScope @Owner ResponsibleSignificantChangeFlagNode provideResponsibleSignificantChangeFlagNode() {
        return owner;
    }

    @Provides @ResponsibleSignificantChangeFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @ResponsibleSignificantChangeFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ResponsibleSignificantChangeFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ResponsibleSignificantChangeFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ResponsibleSignificantChangeFlagNodeScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

}